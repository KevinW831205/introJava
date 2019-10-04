package com.company;

public class Window {
    private Dimensions dimensions;
    private String glass;
    private String shades;
    private boolean isOpen;


    public Window(Dimensions dimensions, String glass, String shades) {
        this.dimensions = dimensions;
        this.glass = glass;
        this.shades = shades;
        this.isOpen = false;
    }

    public void openWindow(){
        if(isOpen){
            System.out.println("Window is already open");
        } else {
            this.isOpen = true;
            System.out.println("Opened window");
        }
    }

    public void closeWindow(){
        if(!isOpen){
            System.out.println("Window is already closed");
        } else {
            this.isOpen = false;
            System.out.printf("Closed window");
        }
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getGlass() {
        return glass;
    }

    public String getShades() {
        return shades;
    }
}
