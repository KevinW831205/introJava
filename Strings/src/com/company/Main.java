package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String myString = "learning string";
        System.out.println("myString's value " + myString);

        myString += ", adding to string";

        System.out.println(myString);

        String unicoded = "\u00ABasdf";

        System.out.println(unicoded);

        String differentVariables1 = "235";
        int differentVariables2 = 222;
        System.out.println((String)differentVariables1 + differentVariables2);
        System.out.println(differentVariables1 + differentVariables2);

//        System.out.println((int) differentVariables1 + differentVariables2);


    }
}
