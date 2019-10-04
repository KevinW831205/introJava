package com.company;

public class Room {
    private String name;
    private Bed room1Bed;
    private Window room1Window;
    private boolean isOccupied;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Lamp lamp;


    public Room(String name, Bed room1Bed, Window room1Window, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Lamp lamp) {
        this.name = name;
        this.room1Bed = room1Bed;
        this.room1Window = room1Window;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.lamp = lamp;
        this.isOccupied = false;
    }

    public void occupying(){
        isOccupied = true;
        System.out.println("Someone is going to use the room.");
        room1Bed.changeSheets();
    }

    public void vaccant(){
        isOccupied = false;
        System.out.println("visitors of the room has left");
        room1Window.openWindow();
    }

    public Window getRoom1Window() {
        return room1Window;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed(){
        System.out.println("making bed in " + name);
        room1Bed.make();
    }
}
