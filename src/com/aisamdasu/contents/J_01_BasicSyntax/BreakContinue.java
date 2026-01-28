package com.aisamdasu.contents.J_01_BasicSyntax;

public class BreakContinue {
    public static void main(String[] args) {
        int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			sum += i;
		}
		System.out.println("1~100까지 홀수의 합: " + sum);

		sum = 0;
		int count = 0;
		while(true) {
			count++;
			if(count > 50) {
				break;
			}
			sum += count;
		}
		System.out.println("1 ~ 50까지 합: " + sum);
    }
}
