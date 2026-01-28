package com.aisamdasu.contents.J_26_Singleton;

// singleton -> 반드시 전체 프로그램 생애동안 객체가 딱 1개만 존재하는것
// singleton 패턴도 존재
// 1개의 객체 생성후, 절대 추가로 못만들도록 해줌 .
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton() {
    }
    public static Singleton getInstance() {
        return singleton;
    }
}
