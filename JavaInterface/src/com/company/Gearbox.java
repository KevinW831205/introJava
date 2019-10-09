package com.company;

public class Gearbox {
    private boolean clutchIsIn;

    // if modify the parameter required other code will break
    public void operateClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }

}
