package com.company;

public class Lamp {
    private String style;
    private int globRating;
    private boolean isOn;
    private boolean isPowered;

    public Lamp(String style, int globRating) {
        this.style = style;
        this.globRating = globRating;
        isOn = false;
        isPowered = true;
    }

    public void turnOn(){
        if(isPowered){
            if(!isOn){
                this.isOn = true;
                System.out.println("turned on lamp");
            } else {
                System.out.println("the lamp is already on");
            }
        } else {
            System.out.println("no power");
        }
    }

    public void turnOff(){
        if(isOn){
            this.isOn = false;
            System.out.println("turned off lamp");
        } else {
            System.out.println("lamp is not on");
        }
    }

    public void pullPlug(){
        isPowered = false;
        isOn =false;
        System.out.println("no more power");
    }

    public String getStyle() {
        return style;
    }

    public int getGlobRating() {
        return globRating;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isPowered() {
        return isPowered;
    }
}
