package com.aisamdasu.contents.J_01_BasicSyntax;

public class TernaryOp {
    public static void main(String[] args) {
        int num = 10;
		String result;

		if (num % 2 == 0) {
			result = "짝수";
		}else {
			result = "홀수";
		}
		System.out.println("num: " + result);

		result = "";
		result = num % 2 == 0 ? "짝수": "홀수";
		System.out.println("num: " + result);

		System.out.println("---------<윤년 계산>------------");
		result = "";
		int year = 1999; // 평년
//		int year = 2000; // 윤년
//		int year = 2024; // 윤년
//		int year = 2100; // 평년
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					result = "윤년";
				}else {
					result = "평년";
				}
			}else {
				result = "윤년";
			}
		} else {
			result = "평년";
		}
		System.out.println(year + " = " + result);

		result = (year % 4 != 0) ? "평년": (year % 100 != 0) ? "윤년": (year % 400 == 0) ? "윤년": "평년";
		System.out.println(year + " = " + result);
    }
}
