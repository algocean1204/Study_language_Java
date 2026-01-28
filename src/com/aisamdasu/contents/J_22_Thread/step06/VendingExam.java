package com.aisamdasu.contents.J_22_Thread.step06;

public class VendingExam {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        // Critical Section 임계영역
        Guest01 guest01 = new Guest01();
        guest01.setMachine(machine);
        guest01.start();


        Guest02 guest02 = new Guest02();
        guest02.setMachine(machine);
        guest02.start();
    }
}
