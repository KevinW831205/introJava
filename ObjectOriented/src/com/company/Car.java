package com.company;

public class Car {

    // State component, fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;
//    public int fuel;  public give access to other classes.

    public void setModel(String modelName){
        String modelInput = modelName.toLowerCase();
        if(modelInput.equals("compass") || modelInput.equals("cherokee")){
            this.model = modelInput;
        } else {
            this.model="unknown";
            System.out.println("not a valid model");
        }


    }

    public String getModel(){
        return this.model;
    }


}
