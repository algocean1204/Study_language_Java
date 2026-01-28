package com.aisamdasu.contents.J_12_NestedClass;

public class EngineExam {
    public static void main(String[] args) {
        Engine gasolineEngin = new Engine(){
            @Override
            public void runEngine() {
                System.out.println("gasoline engine");
            }
        };

        SUV santafe = new SUV(gasolineEngin);
        santafe.drive();

        SUV sorento = new SUV(new Engine()){
            @Override
            public void runEngine() {
                System.out.println("brbrbrbrbr");
            }
        };
        sorento.drive();
    }
}
