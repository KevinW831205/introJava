package com.company;

public class SomeClass {
    private final String name;
    private static int classCounter =0;
    public final int instanceNumber;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is "+ instanceNumber);

    }

//    public SomeClass(){
////        InstanceNumber =1; // final variables can't be changed else where except in constructor
//    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
