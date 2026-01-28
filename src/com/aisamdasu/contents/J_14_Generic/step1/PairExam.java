package com.aisamdasu.contents.J_14_Generic.step1;

public class PairExam {
    public static void main(String[] args) {

        // -------------- Int <-> Int
        Pair<Integer,String> p1 = new Pair<Integer,String>(1,"Java");
        Pair<Integer,String> p2 = new Pair<Integer,String>(1,"Java");

        boolean result1 = Util.compare(p1, p2);
        // 원래 문법 : boolean result1 = Util.<Integer,String>compare(p1, p2);

        if(result1){
            System.out.println("P1과 P2는 동일하다.");
        }else {
            System.out.println("P1과 P2는 다르다 ");
        }

        // -------------- String <-> String
        Pair<String,String> p3 = new Pair<String,String>("길동홍","Java");
        Pair<String,String> p4 = new Pair<String,String>("길순홍","Java");

        boolean result2 = Util.compare(p3, p4);

        if(result2){
            System.out.println("P1과 P2는 동일하다.");
        }else {
            System.out.println("P1과 P2는 다르다 ");
        }
    }
}
