package com.company;

public class Bed {
    private String mattress;
    private Dimensions dimensions;
    private String size;
    private int pillows;

    public Bed(String mattress, Dimensions dimensions, String size) {
        this.mattress = mattress;
        this.dimensions = dimensions;
        this.size = size;
        this.pillows = 1;
    }

    public void changeSheets(){
        System.out.println("Sheets are changed");
    }

    public void make(){
        System.out.println("bed is made");
    }

    public void addPillow(){
        System.out.println("added pillow");
        pillows++;
    }

    public void removePillow(){
        System.out.println("removed 1 pillow");
        pillows--;
    }

    public int getPillows() {
        return pillows;
    }

    public String getMattress() {
        return mattress;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getSize() {
        return size;
    }
}
