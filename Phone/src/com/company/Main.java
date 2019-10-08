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
        boolean contactExists = phone.contactExists(name);
        if(contactExists){
            System.out.println("Contact name already exists");
        } else {
            System.out.println("Enter Contact Phone Number:");
            String number = scanner.nextLine();
            phone.addContact(name, number);
        }
    }

    public static void modifyContact() {
        System.out.println("Enter Contact Name to Modify: ");
        String name = scanner.nextLine();
        if (phone.contactExists(name)) {
            System.out.println("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.println("Enter new number");
            String newNumber = scanner.nextLine();
            phone.modifyContact(name,newName,newNumber);
        } else {
            System.out.println("Couldn't find contact");
        }
    }
}
