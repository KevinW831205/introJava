package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car jeep = new Car();
        Car toyota = new Car();
        System.out.println();
        // jeep. to see methods and states related to class

        jeep.setModel("compas");

        jeep.setModel("compass");
        String model1 = jeep.getModel();
        System.out.println(model1);
    }
}
