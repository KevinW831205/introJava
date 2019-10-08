package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Bank theBank = new Bank("The Bank");
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
	// write your code here

////        ArrayList<int> intArrLIst = new ArrayList<int>(); // array list needs a class cant have a primitive type.
//        // alternative
//        ArrayList<IntClass> intArrList = new ArrayList<IntClass>();
//        intArrList.add(new IntClass(3));
//
//        // however Java has autoboxing to deal with it.
//        Integer integer = new Integer(54);
//        Integer integer1 = 24; // complie time converts it to Integer.Valueof(24);
//        System.out.println(integer1);
//        Double doubleVal = new Double(3.43);
//
//        ArrayList<Integer> intArrList1 = new ArrayList<Integer>();
//        for(int i =0; i<10; i++){
//            intArrList1.add(Integer.valueOf(i));
//        }
//
//        for(int i=0;i<10;i++){
//            System.out.println(i+ " arrayList1 "+intArrList1.get(i).intValue());
//        }
//
//        ArrayList<Double> doubleValues = new ArrayList<Double>();
//        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
//            doubleValues.add(dbl);
//        }
//
//        for(int i=0; i<doubleValues.size(); i++){
//            double val = doubleValues.get(i).doubleValue();
//            System.out.println("i"+i+" "+val);
//        }

        // Bank exercise

        boolean exit = false;
        int command = 0;


        while (!exit){
            System.out.println("Enter an command");
            command = scanner.nextInt();
            scanner.nextLine();
            printInstructions();

            switch (command){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    theBank.printBranches();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    printCustomersOfBranch();
                    break;
                case 4:
                    addCustomerToBranch();
                    break;
                case 5:
                    printCustomerBalance();
                    break;
                case 6:
                    addTransactionToCustomer();
                    break;
                case 7:
                    exit = true;
                    break;
            }


        }


    }

    public static void printInstructions(){
        System.out.println("\nEnter ");
        System.out.println("\t 0 - To print Instructions");
        System.out.println("\t 1 - To print Branches");
        System.out.println("\t 2 - To print a Branches Customer");
        System.out.println("\t 3 - To add a customer to a Branch");
        System.out.println("\t 4 - To print a customers balance");
        System.out.println("\t 5 - To add a transaction for a customer");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addBranch(){
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        theBank.addBranch(branchName);
    }

    public static void printCustomersOfBranch(){
        System.out.println("Enter branch name: ");
        String branchName = scanner.nextLine();
        theBank.printCustomersOfBranch(branchName);
    }

    public static void addCustomerToBranch(){

    }

    public static void printCustomerBalance(){

    }

    public static void addTransactionToCustomer(){

    }


}





//class IntClass{
//    private int value;
//
//    public IntClass(int value) {
//        this.value = value;
//    }
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//}
