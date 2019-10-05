package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger burger1 = new Hamburger("normal","Beef", new Lettuce(), new Lettuce(), new Lettuce(), new Lettuce());

        Lettuce l1 = new Lettuce();

        System.out.println(l1.getName());
    }
}
