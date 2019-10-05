package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Hamburger burger1 = new Hamburger("normal","Beef", new Lettuce(), new Lettuce(), new Lettuce(), new NoItem());
//
//        burger1.printFinal();
//
//        HealthyBurger burger2 = new HealthyBurger("Chicken",new Lettuce(), new Drink(), new Chips(), new Carrot(), new Tomato(), new Cheese() );
//        burger2.printFinal();
//
//        DeluxeBurger burger3 = new DeluxeBurger("idk","bacon");
//        burger3.printFinal();

        Hamburger burger1 = new Hamburger("normal","Beef");
        burger1.setAddition1(new Lettuce());
        burger1.printFinal();
        System.out.println("burger1 final price is "+burger1.getTotal()+"\n");

        DeluxeBurger burger2 = new DeluxeBurger("white","Sausage");
        burger2.setAddition2(new Drink());
        burger2.printFinal();
        System.out.println("burger2 final price is "+burger2.getTotal()+"\n");

        HealthyBurger burger3 = new HealthyBurger("chicken");
        burger3.setAddition1(new Lettuce());
        burger3.setAddition6(new Drink());
        burger3.printFinal();
        System.out.println("burger2 final price is "+burger2.getTotal()+"\n");



    }
}
