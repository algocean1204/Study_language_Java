package com.aisamdasu.using_Java.J_03_Stack.step2;

import java.util.Stack;

public class CheckParen {
    public static void main(String[] args) {

		String expression = "[ a { b + c - ( a * 3 ) } + 4 ]";
		System.out.println(checkMatch(expression));

		expression = "[ a { b + c - ( a * 3 ) + 4 ]";
		System.out.println(checkMatch(expression));
	}

	public static boolean checkMatch(String expression) {
		Stack<String> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(expression);
            }
            if (c == ')' || c == '}' || c == ']') {
                stack.pop();
            }
        }
        return stack.isEmpty() ?  false : true;
	}
}
