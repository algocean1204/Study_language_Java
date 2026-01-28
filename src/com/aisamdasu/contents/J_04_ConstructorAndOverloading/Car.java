package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class Car {
    String model = "new car";
	String color = "white";

	public Car(String inputModel, String inputColor) {
		model = inputModel;
		color = inputColor;
	}
	void drive() {
		System.out.println(model + "(" + color + ")" + " driving~~~~~");
	}
}
