package com.company;

public class Addition {
    private double price;
    private String name;

    public Addition(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void printTotal(){
        System.out.println(this.name +"..." +this.price);
    }
}

class NoItem extends Addition{
    public NoItem() {
        super(0,"No item");
    }

    @Override
    public void printTotal() {
    }
}

class Lettuce extends Addition{
    public Lettuce() {
        super(0.5, "Lettuce");
    }
}

class Drink extends Addition{
    public Drink() {
        super(1.0, "Drink");
    }
}

class Chips extends Addition{
    public Chips() {
        super(1.5, "Chips");
    }
}

class Tomato extends Addition{
    public Tomato() {
        super(0.5, "Tomato");
    }
}

class Cheese extends Addition{
    public Cheese() {
        super(1.0, "Cheese");
    }
}

class Carrot extends Addition{
    public Carrot() {
        super(0.5, "Carrot");
    }
}
