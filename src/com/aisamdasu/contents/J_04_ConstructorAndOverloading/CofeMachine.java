package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class CofeMachine {
    private String water;
	private int coffeeBean;
	private int sugar;
	private boolean cream;
	private String production;

	public void makeCoffee() {
		this.water = "hot-water";
		this.coffeeBean = 1;
		this.sugar = 0;
		this.cream = false;
	}

	private void produce() {
		production = coffeeBean + "-shot, " + sugar + "-sugar, ";
		production += cream == true ? "with cream" : "without cream";
		production += " in " + water;
	}

	public String getProduction() {
		produce();
		return production;
	}

	public void addShot(int i) {
		if (i > 0 && i < 3) {
			coffeeBean += i;
		}
	}

	public void addSugar(int i) {
		if (i < 0) {
			sugar++;
            return;
		}
		if (i > 10) {
			sugar += 10;
            return;
		}
        sugar += i;
	}

	public void addCream() {
		cream = true;
	}
}
