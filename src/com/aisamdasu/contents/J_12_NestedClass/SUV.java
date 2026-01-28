package com.aisamdasu.contents.J_12_NestedClass;

public class SUV extends Engine {
    private Engine engine;
    public SUV(Engine engine) {
        super();
        this.engine = engine;
    }
    public void drive(){
        engine.runEngine();
    }
}
