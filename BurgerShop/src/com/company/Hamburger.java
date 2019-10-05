package com.company;

public class Hamburger {
    private String breadRoll;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;
    private double basePrice;


    public Hamburger(String breadRoll, String meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
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

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
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
        if(addition1 != null){
            addition1.printTotal();
        }
        if(addition2 != null){
            addition2.printTotal();
        }
        if(addition3 != null){
            addition3.printTotal();
        }
        if(addition4 != null){
            addition4.printTotal();
        }
    }

    public double getTotal() {
        double total = getBasePrice();
        if(addition1 != null){
            total += addition1.getPrice();
        }
        if(addition2 != null){
            total += addition2.getPrice();
        }
        if(addition3 != null){
            total += addition3.getPrice();
        }
        if(addition4 != null){
            total += addition4.getPrice();
        }
        return total;
    }
}

class HealthyBurger extends Hamburger{
    Addition addition5;
    Addition addition6;

    public HealthyBurger(String meat) {
        super("Brown Rye", meat);
    }

    @Override
    public void printFinal() {
        super.printFinal();
        if(addition5 != null){
            addition5.printTotal();
        }
        if(addition6 != null){
            addition6.printTotal();
        }
    }

    @Override
    public double getTotal() {
        double total = super.getTotal() ;
        if(addition5 != null){
            total += addition5.getPrice();
        }
        if(addition6 != null){
            total += addition6.getPrice();
        }
        return total;
    }

    public void setAddition5(Addition addition5) {
        this.addition5 = addition5;
    }

    public void setAddition6(Addition addition6) {
        this.addition6 = addition6;
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
        super(breadRoll, meat);
        this.setAddition1(new Drink());
        this.setAddition2(new Chips());
    }

    @Override
    public void printFinal() {
        System.out.println("Deluxe Hamburger "+getBreadRoll()+" "+getMeat()+"...4.00");
        getAddition1().printTotal();
        getAddition2().printTotal();
    }

    @Override
    public void setAddition1(Addition addition1) {
        System.out.println("error can't change deluxe burger addition");
    }

    @Override
    public void setAddition2(Addition addition2) {
        System.out.println("error can't change deluxe burger addition");
    }

    @Override
    public void setAddition3(Addition addition3) {
        System.out.println("error can't change deluxe burger addition");
    }

    @Override
    public void setAddition4(Addition addition4) {
        System.out.println("error can't change deluxe burger addition");
    }
}
