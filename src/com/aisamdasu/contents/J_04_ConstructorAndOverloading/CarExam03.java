package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class CarExam03 {
    public static void main(String[] args) {
        Car03 car01 = new Car03();
        Car03 car02 = new Car03("sedan");
        Car03 car03 = new Car03("SUV","blue");

        car01.drive();
        car02.drive();
        car03.drive();
    }
}
