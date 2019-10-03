package com.company;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
        double dist = (double) Math.sqrt(this.x*this.x + this.y*this.y);
        return dist;
    }

    public double distance(int x, int y){
        double dist = (double) Math.sqrt( (this.x - x) * (this.x - x )+ (this.y - y) *(this.y - y) );
        return dist;
    }

    public double distance (Point p){
        double dist = (double) Math.sqrt( (this.x - p.getX()) * (this.x - p.getX()) + (this.y - p.getY()) *(this.y - p.getY()));
        return dist;
    }


}
