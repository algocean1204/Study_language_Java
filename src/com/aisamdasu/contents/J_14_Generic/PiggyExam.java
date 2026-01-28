package com.aisamdasu.contents.J_14_Generic;

// Object와 다르게 형변환이 일어나지 않음
public class PiggyExam {
    public static void main(String[] args) {
        GenericPiggyBank<Integer> intPiggy = new GenericPiggyBank<>(); // <>는 한쪽만 써도 됨, 생략 가능
        intPiggy.setMoney(1000);
        int i = intPiggy.getMoney();
        System.out.println(i);

        GenericPiggyBank<Double> doublePiggy = new GenericPiggyBank<>();
        doublePiggy.setMoney(11.2);
        double d = doublePiggy.getMoney();
        System.out.println(d);

        GenericPiggyBank<String> stringPiggy = new GenericPiggyBank<>();
        stringPiggy.setMoney("HelloWorld");
        String s = stringPiggy.getMoney();
        System.out.println(s);
    }
}
