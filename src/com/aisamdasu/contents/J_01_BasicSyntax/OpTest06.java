package com.aisamdasu.contents.J_01_BasicSyntax;

public class OpTest06 {
    public static void main(String[] args) {
        System.out.println("1: " + toBinaryString(1));
		System.out.println("1 << 3: " + (1 << 3)); // 1 * 2 ** 3
		System.out.println(toBinaryString(1 << 3));
		System.out.println("----------------------------------------");

		System.out.println("-8: " + toBinaryString(-8));
		System.out.println("-8 >> 1: " + (-8 >> 1)); // -8 / 2 ** 1
		System.out.println(toBinaryString(-8 >> 1));
		System.out.println("----------------------------------------");

		System.out.println("-8 >>> 1: " + (-8 >>> 1));
		System.out.println(toBinaryString(-8 >>> 1));
    }
    public static String toBinaryString(int val) {
		String s = Integer.toBinaryString(val);
		while (s.length() < 32) {
			s = "0" + s;
		}
		return s;
	}
}
