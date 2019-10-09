package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone myPhone;
        // Deskphone myPhone will also work in circumstances
        myPhone = new Deskphone(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);

    }
}
