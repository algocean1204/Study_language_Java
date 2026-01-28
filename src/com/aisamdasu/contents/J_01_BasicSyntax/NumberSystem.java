package com.aisamdasu.contents.J_01_BasicSyntax;

public class NumberSystem {
    public static void main(String[] args) {
        int binNumber = 0b11010010;
        System.out.println("binNumber: " + binNumber);
        System.out.println();

        int hexaNumber = 0x12c;
        System.out.println("hexaNumber: " + hexaNumber);
        System.out.println();

        String hexaString = Integer.toHexString(binNumber);
        System.out.println("hexaString: " + hexaString);
        System.out.println();

        int decimalNumber = Integer.parseInt(hexaString,16);
        System.out.println("decimalNumber: " + decimalNumber);
    }
}
