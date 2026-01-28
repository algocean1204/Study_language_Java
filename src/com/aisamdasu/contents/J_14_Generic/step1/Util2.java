package com.aisamdasu.contents.J_14_Generic.step1;

public class Util2 {
    public static <T extends Number> int compare(T t1, T t2) {
        double d1 = t1.doubleValue();
        double d2 = t2.doubleValue();
        return Double.compare(d1, d2);
    }
}
