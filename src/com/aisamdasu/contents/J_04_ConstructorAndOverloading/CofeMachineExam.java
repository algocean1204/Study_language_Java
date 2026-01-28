package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class CofeMachineExam {
    public static void main(String[] args) {
        CofeMachine machine = new CofeMachine();

		machine.makeCoffee();
		machine.addShot(1);
		machine.addShot(100);
		machine.addSugar(100);
		System.out.println(machine.getProduction());
    }
}
