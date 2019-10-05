package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger burger1 = new Hamburger("normal","Beef", new Lettuce(), new Lettuce(), new Lettuce(), new NoItem());

        burger1.printFinal();

        HealthyBurger burger2 = new HealthyBurger("Chicken",new Lettuce(), new Drink(), new Chips(), new Carrot(), new Tomato(), new Cheese() );
        burger2.printFinal();

        DeluxeBurger burger3 = new DeluxeBurger("idk","bacon");
        burger3.printFinal();
    }
}
