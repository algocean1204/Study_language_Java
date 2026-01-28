package com.aisamdasu.contents.J_11_Interface;

public class Bird implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍멍멍멍");
    }
    @Override
    public void eat(){
        System.out.println("물다");
    }
}
