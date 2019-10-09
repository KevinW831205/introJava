package com.company;

public class Deskphone implements ITelephone{

    private int myNumber;
    private boolean isRinging;

    public Deskphone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, always on");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now Ringing "+phoneNumber+" on desk phone");
    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the phone");
            isRinging = false;
        } else {
            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Ringing");
        } else {
            isRinging = false;
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
