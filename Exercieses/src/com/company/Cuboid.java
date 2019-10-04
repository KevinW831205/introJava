package com.company;

public class Cuboid extends Rectangle{
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        if(height<0){
            height=0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2 + getWidth()*getHeight()*2+ getLength()*getHeight()*2;
    }
}
