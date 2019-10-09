package com.company;

public class Mobilephone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public Mobilephone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone powered up");
        this.isOn = true;
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("Now Ringing "+phoneNumber+" on mobile phone");
        } else {
            System.out.println("Phone is turned off");
        }
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
        if(phoneNumber == myNumber && isOn){
            isRinging = true;
            System.out.println("Ringing");
        } else {
            isRinging = false;
            System.out.println("phone not on or wrong number");
        }

        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
