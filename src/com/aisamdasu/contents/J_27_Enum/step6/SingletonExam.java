package com.aisamdasu.contents.J_27_Enum.step6;

public class SingletonExam {
    public static void main(String[] args) {
        Singleton hello = Singleton.INSTANCE;
        hello.sayHello();
    }
}
