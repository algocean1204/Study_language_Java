package com.aisamdasu.using_Java.J_03_Stack.step3;

import java.util.Stack;

public class Postfix {
    public static void main(String[] args) {
        String expression = "3+(2*4)-5";
        System.out.println(infixToPostfix(expression));
    }

    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            // 1. 숫자(피연산자)인 경우: 즉시 결과에 추가
            if (Character.isDigit(ch)) {
                result.append(ch);
            }
            // 2. 여는 괄호인 경우: 연산자 스택에 push
            else if (ch == '(') {
                operatorStack.push(ch);
            }
            // 3. 닫는 괄호인 경우: 여는 괄호를 만날 때까지 연산자 pop 및 결과 추가
            else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    result.append(operatorStack.pop());
                }
                operatorStack.pop();
            }
            // 4. 연산자인 경우 (+, -, *, /)
            else if (isOperator(ch)) {
                // 스택에 있는 연산자가 현재 연산자보다 우선순위가 높거나 같으면 pop
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
                    result.append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }
        }

        // 5. 스택에 남은 모든 연산자 처리
        while (!operatorStack.isEmpty()) {
            result.append(operatorStack.pop());
        }

        return result.toString();
    }

    // 연산자 우선순위 설정
    public static int precedence(char op) {
        if (op == '+' || op == '-') return 1;
        if (op == '*' || op == '/') return 2;
        return -1; // 괄호 등
    }

    public static boolean isOperator(char ch) {
        return ch == '+' || ch == '-' || ch == '*' || ch == '/';
    }
}

/*
 이렇게도 가능함.

private static String infixToPostfix(String expression) {
		StringBuilder builder = new StringBuilder();

		DLLStack<Character> stack = new DLLStack<Character>();
		char[] arrayExpression = expression.toCharArray();

		for (int i = 0; i < arrayExpression.length; i++) {
			if (arrayExpression[i] == '(') {
				stack.push(arrayExpression[i]);
			} else if (arrayExpression[i] >= '0' && arrayExpression[i] <= '9') {
				builder.append(arrayExpression[i]);
			} else if (arrayExpression[i] == ')') {
				while (stack.peek() != '(') {
					builder.append(stack.pop());
				}
				stack.pop();
			} else {
				if (stack.empty() || stack.peek() == '(') {
					stack.push(arrayExpression[i]);
				} else if (comparePriority(arrayExpression[i], stack.peek()) > 0) {
					stack.push(arrayExpression[i]);
				} else {
					while (stack.size() != 0 && stack.peek() != '(') {
						builder.append(stack.pop());
					}
					stack.push(arrayExpression[i]);
				}
			}
		}
		while (stack.size() != 0) {
			builder.append(stack.pop());
		}
		return builder.toString();
	}

	private static int comparePriority(char a, char b) {
		if (a == '*' || a == '/') {
			if (b == '*' || b == '/') {
				return 0;
			} else {
				return 1;
			}
		} else {
			if (b == '*' || b == '/') {
				return -1;
			} else {
				return 0;
			}
		}
	}
 */