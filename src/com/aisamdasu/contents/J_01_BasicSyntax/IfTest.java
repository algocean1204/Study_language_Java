package com.aisamdasu.contents.J_01_BasicSyntax;

public class IfTest {
    public static void main(String[] args) {
        // if
		int num = 10;
		System.out.println("-------------<if>-------------------");
		if ((num % 2) == 0) {
			System.out.println(num + "은 짝수입니다.");
		}

		// if else
		System.out.println("-------------<if else>--------------");
		num = 3;
		if ((num % 2) == 0) {
			System.out.println(num + "은 짝수입니다.");
		}else {
			System.out.println(num + "은 홀수입니다.");
		}

		// if else if
		System.out.println("-------------<if else if >----------");
		int lunchPrice = 8000;
		System.out.println("점심값: " + lunchPrice);
		if (lunchPrice > 10000) {
			System.out.println("점심값이 비싸군요");
		}else if (lunchPrice < 6000){
			System.out.println("점심값이 매우 저렴하군요");
		}else {
			System.out.println("점심값이 합리적이군요");
		}

		// String if
		System.out.println("-------------<String if >----------");
		String s = "과일";
		if (s.equals("과일")) {
			System.out.println("dessert");
		}else {
			System.out.println("main dish");
		}

		if (s == "과일") {
			System.out.println("dessert");
		}else {
			System.out.println("main dish");
		}

		String s2 = new String("과일");
		System.out.println("s: " + s + ", " + "s2: " + s2);
		if(s == s2) {
			System.out.println("s == s2");
		}else {
			System.out.println("s != s2");
		}

		if(s.equals(s2)) {
			System.out.println("s.equals(s2)");
		}else {
			System.out.println("not s.equals(s2)");
		}
    }
}
