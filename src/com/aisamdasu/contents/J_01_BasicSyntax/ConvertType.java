package com.aisamdasu.contents.J_01_BasicSyntax;

public class ConvertType {
    public static void main(String[] args) {
        byte byteVal = 10;
        short shortVal = byteVal;
        int intVal = shortVal;
        long longVal = intVal;
        float floatVal = longVal;
        double doubleVal = floatVal;

        System.out.println("byteVal: " + byteVal);
        System.out.println("shortVal: " + shortVal);
        System.out.println("intVal: " + intVal);
        System.out.println("longVal: " + longVal);

        System.out.println("floatVal: " + floatVal);
        System.out.println("doubleVal: " + doubleVal);

        int i = 128;
        byte b = (byte)i;

        System.out.println("i: " + i);
        System.out.println("b: " + b);
    }
}
