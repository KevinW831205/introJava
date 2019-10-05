package com.company;

public class Hamburger {
    private String breadRoll;
    private String meat;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String breadRoll, String meat, Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.addition1 = addition1;
        this.addition2 = addition2;
        this.addition3 = addition3;
        this.addition4 = addition4;
    }

}

class HealthyBurger extends Hamburger{
    public HealthyBurger(String breadRoll, String meat, Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        super(breadRoll, meat, addition1, addition2, addition3, addition4);
    }
}

class deluxeBurger extends Hamburger{
    public deluxeBurger(String breadRoll, String meat, Addition addition1, Addition addition2, Addition addition3, Addition addition4) {
        super(breadRoll, meat, addition1, addition2, addition3, addition4);
    }
}
