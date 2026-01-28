package com.aisamdasu.contents.J_11_Interface;

public class AnimalExam {
    public static void main(String[] args) {
        Animal puppy = new Dog();
        Animal sparrow = new Bird();

        puppy.sound();
        sparrow.sound();
        sparrow.eat();
    }
}
