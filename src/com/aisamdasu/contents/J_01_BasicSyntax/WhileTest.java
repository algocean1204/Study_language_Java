package com.aisamdasu.contents.J_01_BasicSyntax;

public class WhileTest {
    public static void main(String[] args) {
        int sum = 0, i = 1;

		while(i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("1~100 까지의 합: " + sum);
    }
}
