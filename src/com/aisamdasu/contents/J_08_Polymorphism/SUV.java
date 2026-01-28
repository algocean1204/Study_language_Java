package com.aisamdasu.contents.J_08_Polymorphism;

public class SUV {
    private DieselEngine engine;
    public SUV(DieselEngine engine) {
        super();
        this.engine = engine;
    }
    public void drive(){
        engine.runEngine();
    }
}
