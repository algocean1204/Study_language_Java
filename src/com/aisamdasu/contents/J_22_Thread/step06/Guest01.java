package com.aisamdasu.contents.J_22_Thread.step06;

public class Guest01 extends Thread {
    private VendingMachine machine;

    public VendingMachine getMachine() {
        return machine;
    }

    public void setMachine(VendingMachine machine) {
        this.machine = machine;
        this.setName("Guest01");
    }
    @Override
    public void run() {
        machine.setOrder("탄산수");
    }
}
