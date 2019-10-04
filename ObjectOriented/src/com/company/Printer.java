package com.company;

public class Printer {
    private String model;
    private int tonerLevel;
    private int numberOfPagesPrinted = 0;
    private boolean isDuplex = false;

    public Printer(String model, int tonerLevel, boolean isDuplex) {
        this.model = model;
        if(tonerLevel>=0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = 100;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int percent){
        if(percent+tonerLevel >100){
            System.out.println("Can't fill that much, current toner level " + tonerLevel);
        } else{
            tonerLevel+= percent;
            System.out.println("Filled toner current level "+tonerLevel);
        }
    }

    public void printPage(int pages){
        tonerLevel -= pages;
        if(tonerLevel<=0){
            System.out.println("out of ink");
        }

        if(isDuplex){
           int numPrinted = (int) Math.ceil((double) pages/2);
           numberOfPagesPrinted += numPrinted;
            System.out.println("total paper used: "+numPrinted + " Printer currently printed "+ numberOfPagesPrinted +" pages");
        } else {
            numberOfPagesPrinted += pages;
            System.out.println("total paper used: "+pages + " Printer currently printed "+ numberOfPagesPrinted +" pages");
        }
    }

    public String getModel() {
        return model;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
