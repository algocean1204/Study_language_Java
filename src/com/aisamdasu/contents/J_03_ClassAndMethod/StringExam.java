package com.aisamdasu.contents.J_03_ClassAndMethod;

public class StringExam {
    public static void main(String[] args) {
        String s1 = "Apple";
		String s2 = "Apple";
		String s3 = new String("Apple");

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);

		if (s1 == s2) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}

		if (s1 == s3) {
			System.out.println("s1 == s3");
		}else {
			System.out.println("s1 != s3");
		}

		if (s1.equals(s3)) {
			System.out.println("s1.equals(s3)");
		}else {
			System.out.println("not s1.equals(s3)");
		}
    }
}
