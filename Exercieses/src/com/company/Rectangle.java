package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(length<0){
            length=0;
        }
        if(width<0){
            width=0;
        }
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width*length;
    }

}
