package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        // write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter a choice");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 7:
                    processArrayList();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem(){
        System.out.print("Please enter an item ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        groceryList.printGroceryList();
        System.out.print("Select an item to modify ");
        String itemNo = scanner.nextLine();
//        scanner.nextLine();
        System.out.print("Enter Replacement  ");
        String newItem = scanner.nextLine();
//        groceryList.modifyGroceryItem(itemNo-1,newItem);
        groceryList.modifyGroceryItem(itemNo,newItem);
    }

    public static void removeItem(){
        groceryList.printGroceryList();
        System.out.print("Select an item to remove ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem(){
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onList(searchItem)){
            System.out.println("found item");
        }else{
            System.out.println("didn't find item");
        }
//        System.out.println(groceryList.findItem(searchItem));
    }

    public static void processArrayList(){
        // way to duplicate array list
//        ArrayList<String> newArray = new ArrayList<String>();
//        newArray.addAll(groceryList.getGroceryList());

        // also duplicates
        ArrayList<String> newArray2 = new ArrayList<String>(groceryList.getGroceryList());

        // converting array list to String
        String[] array3 = new String[groceryList.getGroceryList().size()];
        array3 = groceryList.getGroceryList().toArray(array3);

    }
}
