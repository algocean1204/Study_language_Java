package com.aisamdasu.contents.J_10_AbstractClass;

public class EnginExam {
    public static void main(String[] args) {
        GasolineEngine engine = new GasolineEngine();
        engine.runEngine();
        DieselEngine dieselEngine = new DieselEngine();
        dieselEngine.runEngine();
    }
}
