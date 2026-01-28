package com.aisamdasu.contents.J_01_BasicSyntax;

public class OpTest05 {
    public static void main(String[] args) {
        System.out.println("1: " + toBinaryString(1));
		System.out.println("2: " + toBinaryString(2));
		System.out.println("1 & 2: " + (1 & 2));
		System.out.println(toBinaryString((1 & 2)));
		System.out.println("1 | 2: " + (1 | 2));
		System.out.println(toBinaryString((1 | 2)));
		System.out.println("------------------------------------");

		System.out.println("38: " + toBinaryString(38));
		System.out.println("27: " + toBinaryString(27));
		System.out.println("38 ^ 27: " + (38 ^ 27));
		System.out.println(toBinaryString((38 ^ 27)));
		System.out.println("------------------------------------");

		System.out.println("~38: " + ~38);
		System.out.println(toBinaryString(~38));
    }

        public static String toBinaryString(int val) {
		String s = Integer.toBinaryString(val);
		while (s.length() < 32) {
			s = "0" + s;
		}
		return s;
	}
}
