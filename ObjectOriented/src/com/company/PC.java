package com.company;

public class PC {

    private Case myCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case myCase, Monitor monitor, Motherboard motherboard) {
        this.myCase = myCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public Case getMyCase() {
        return myCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
