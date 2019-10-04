package com.company;

public class Bed {
    private String mattress;
    private Dimensions dimensions;
    private String size;

    public Bed(String mattress, Dimensions dimensions, String size) {
        this.mattress = mattress;
        this.dimensions = dimensions;
        this.size = size;
    }

    public void changeSheets(){
        System.out.println("Sheets are changed");
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
