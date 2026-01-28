package com.aisamdasu.contents.J_01_BasicSyntax;

public class ForTest {
    public static void main(String[] args) {
        int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 까지의 합: " + sum);

		int i = 1;
		sum = 0;
		for (; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100 까지의 합: " + sum);

		sum = 0;
		for (int k = 1; k < 100; k += 2) {
			sum += k;
		}
		System.out.println("1~100 까지 홀수의 합: " + sum);
    }
}
