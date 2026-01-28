package com.aisamdasu.contents.J_22_Thread.step06;

public class Guest02 extends Thread {
    private VendingMachine machine;

    public VendingMachine getMachine() {
        return machine;
    }

    public void setMachine(VendingMachine machine) {
        this.machine = machine;
        this.setName("Guest02");
    }
    @Override
    public void run() {
        machine.setOrder("코카콜라 제로");
    }
}
