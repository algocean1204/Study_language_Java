package com.aisamdasu.contents.J_08_Polymorphism;

public class EieselEngineExam {
    public static void main(String[] args) {
        DieselEngine engine = new DieselEngine();
        SUV santafe = new SUV(engine);

        santafe.drive();


    }
}
