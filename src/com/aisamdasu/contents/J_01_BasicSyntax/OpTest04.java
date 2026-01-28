package com.aisamdasu.contents.J_01_BasicSyntax;

public class OpTest04 {
    public static void main(String[] args) {
        int num = 11;
		String s = "Windows " + num;
		System.out.println(s);

		num += 10;
		System.out.println("num + 10: " + num);

		num++;
		System.out.println("num++ : " + num);

		int result = num++ + 10;
		System.out.println("result : " + result);
		System.out.println("num : " + num);

		result = ++num + 10;
		System.out.println("result : " + result);
		System.out.println("num : " + num);
    }
}
