package com.aisamdasu.contents.J_26_Singleton;

public class SingletonExam {
    public static void main(String[] args) {
        // 컴파일 에러 나옴

        //Singleton singleton1 = new Singleton();
//        Singleton singleton2 = new Singleton();
        // 정적 메소드를 호출해서 싱글톤 객체를 얻음
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("같은 Singleton 객체입니다");
        }else {
            System.out.println("다른 singleton 객체입니다.");
        }

    }
}
