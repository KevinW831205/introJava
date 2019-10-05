package com.company;

public class Hamburger {
    private String breadRoll;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double basePrice;


    public Hamburger(String breadRoll, String meat, Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
        this.basePrice = 4.00;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public String getMeat() {
        return meat;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void printFinal(){
        System.out.println("Hamburger "+getBreadRoll()+" "+getMeat()+"...4.00");
        addition1.printTotal();
        addition2.printTotal();
        addition3.printTotal();
        addition4.printTotal();
        System.out.println("Total..."+getTotal());
    }

    public double getTotal() {
        double total = getBasePrice()+addition1.getPrice()+addition2.getPrice()+addition3.getPrice()+addition4.getPrice();
        return total;
    }
}

class HealthyBurger extends Hamburger{
    Addition addition5;
    Addition addition6;

    public HealthyBurger(String meat, Addition addition1, Addition addition2, Addition addition3, Addition addition4, Addition addition5, Addition addition6) {
        super("Brown Rye", meat, addition1, addition2, addition3, addition4);
        this.addition5 = addition5;
        this.addition6 = addition6;

    }

    @Override
    public void printFinal() {
        System.out.println("Healthy Hamburger "+getBreadRoll()+" "+getMeat()+"...4.00");
        getAddition1().printTotal();
        getAddition2().printTotal();
        getAddition3().printTotal();
        getAddition4().printTotal();
        getAddition5().printTotal();
        getAddition6().printTotal();
        System.out.println("Total..."+getTotal());
    }

    @Override
    public double getTotal() {
        return super.getTotal() + addition5.getPrice() +addition6.getPrice();
    }

    public Addition getAddition5() {
        return addition5;
    }

    public Addition getAddition6() {
        return addition6;
    }

}

class DeluxeBurger extends Hamburger{
    public DeluxeBurger(String breadRoll, String meat) {
        super(breadRoll, meat, new Drink(), new Chips(), new NoItem(), new NoItem());
    }

    public void printFinal() {
        System.out.println("Deluxe Hamburger "+getBreadRoll()+" "+getMeat()+"...4.00");
        getAddition1().printTotal();
        getAddition2().printTotal();
        System.out.println("Total..."+getTotal());
    }

}
