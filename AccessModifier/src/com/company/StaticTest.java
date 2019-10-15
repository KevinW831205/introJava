package com.company;

public class StaticTest {
//    private  int numInstances = 0;
    private static int numInstances = 0; // only 1 instance in memory
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
