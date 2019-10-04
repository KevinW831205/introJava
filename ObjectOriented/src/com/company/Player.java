package com.company;

public class Player {

    // public scope gives access to other classes.
    // changing functions and field name will require changes in else where. EX. if change name into full name
    // also forget to initialize some fields without a constructor.
//    public String name;
//    public int health;
//    public String weapon;
//
//    public void loseHealth(int damage){
//        this.health -= damage;
//        System.out.println(this.name+" took "+damage+" Current Health: "+this.health);
//        if(this.health<=0){
//            System.out.println(this.name +" is defeated");
//        }
//    }
//
//    public int healthRemaining() {
//        return this.health;
//    }

    // with proper encapsulation.

    private String name;
    private int health=100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if(health>0 && health<100){
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health -= damage;
        if(this.health<=0){
            System.out.println(this.name + " is defeated");
        }
    }

    public int getHealth() {
        return health;
    }
}
