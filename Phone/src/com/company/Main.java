package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone phone = new MobilePhone();

    public static void main(String[] args) {
        // write your code here
        boolean quit = false;
        int choice = 0;
        printInstruction();


        while (!quit) {
            System.out.println("Enter an instruction");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    phone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
//                case 4:
//                    removeItem();
//                    break;
//                case 5:
//                    searchForItem();
//                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstruction() {
        System.out.println("\nEnter ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print Contacts");
        System.out.println("\t 2 - To add Contact");
        System.out.println("\t 3 - To modify a Contact");
        System.out.println("\t 4 - To remove a Contact");
        System.out.println("\t 5 - To search for a Contact");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addContact() {
        System.out.println("Enter Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Contact Number: ");
        String number = scanner.nextLine();
        boolean success = phone.addContact(new Contact(name,number));
        if(success){
            System.out.println("added "+name+" to contact");
        } else {
            System.out.println("error");
        }
    }

    public static void modifyContact() {
        System.out.println("Enter Contact Name to Modify: ");
        String name = scanner.nextLine();
        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact number");
        String newNumber = scanner.nextLine();
        Contact updatedContact = new Contact (newName,newNumber);
        phone.modifyContact(name,updatedContact);
    }
}
