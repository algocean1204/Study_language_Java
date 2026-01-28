package com.aisamdasu.using_Java.J_03_Stack.step4;

import java.util.Stack;

public class Postfix_Cul {
    public static void main(String[] args) {
        String expression = "3+(2*4)-5";
        System.out.println(infixToPostfix(expression));
        System.out.println(calculate(infixToPostfix(expression)));
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

    public static int calculate(String expression) {
        Stack<Integer> intStack = new Stack<>();
        char[] postfixExpression = expression.toCharArray();
        int a, b;

        for (int i = 0; i < postfixExpression.length; i++) {
            switch (postfixExpression[i]) {
                case '*':
                    b = intStack.pop();
                    a = intStack.pop();
                    intStack.push(a * b);
                    break;
                case '/':
                    b = intStack.pop();
                    a = intStack.pop();
                    intStack.push(a / b);
                    break;
                case '+':
                    b = intStack.pop();
                    a = intStack.pop();
                    intStack.push(a + b);
                    break;
                case '-':
                    b = intStack.pop();
                    a = intStack.pop();
                    intStack.push(a - b);
                    break;
                default:
                    intStack.push(Character.digit(postfixExpression[i], 10));
            }
        }
        return intStack.pop();
    }
}
