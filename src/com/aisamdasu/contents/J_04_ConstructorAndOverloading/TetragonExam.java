package com.aisamdasu.contents.J_04_ConstructorAndOverloading;

public class TetragonExam {
    public static void main(String[] args) {
        Tetragon tetragon = new Tetragon();

        int leftSide = 10, upperSide = 20;
        System.out.println("정사각형 면적: " + tetragon.getSquareArea(leftSide));
        System.out.println("직사각형 면적: " + tetragon.getSquareArea(leftSide,upperSide));
    }
}
