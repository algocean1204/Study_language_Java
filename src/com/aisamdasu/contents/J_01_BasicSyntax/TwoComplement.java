package com.aisamdasu.contents.J_01_BasicSyntax;

public class TwoComplement {
    public static void main(String[] args) {
        int num01 = 18;
        String binNum01 = Integer.toBinaryString(num01);
        System.out.println("num01: " + num01);
        System.out.println("18 => " + binNum01);
        System.out.println();

        num01 = num01 * -1;
        System.out.println("num01: " + num01);
        binNum01 = Integer.toBinaryString(num01);
        System.out.println("-18 => " + binNum01);
    }
}
