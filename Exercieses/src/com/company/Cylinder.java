package com.company;

public class Cylinder extends Circle {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height<0){
            height=0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    @Override
    public double getArea() {
        return super.getArea()*2 + height*getRadius()*2*Math.PI;
    }
}
