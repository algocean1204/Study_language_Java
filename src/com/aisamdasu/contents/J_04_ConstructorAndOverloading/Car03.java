package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class Car03 {
    String model = "new car";
	String color = "white";

	public Car03() {

	}
	public Car03(String model) {
		this.model = model;

	}
	public Car03(String model, String color) {
		//this.model = model;
        this(model);
		this.color = color;
	}
	void drive() {
		System.out.println(model + "(" + color + ")" + " driving~~~~~");
	}
}
