package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        ITelephone myPhone;
////         Deskphone myPhone //will also work in circumstances
//        myPhone = new Deskphone(12345);
//        myPhone.powerOn();
//        myPhone.callPhone(12345);
//
//        // we needed interface to change this class
//        myPhone = new Mobilephone(123456);
//        myPhone.callPhone(123456);
//        myPhone.answer();
//        myPhone.powerOn();


        Player p1 = new Player("player1",30,10);
        System.out.println(p1.toString());
        saveObject(p1);

        p1.setHitPoints(0);
        System.out.println(p1);
        saveObject(p1);
        loadObject(p1);
        System.out.println(p1);

        ISaveable m1 = new Monster("mon",30,40);

        System.out.println( ((Monster) m1).getName()+" has "+((Monster) m1).getStrength()); // declared m1 as Isavable interface but need the monster class for the get strength method
        System.out.println(m1);
        saveObject(m1);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave){
        for(int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }


}

