package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // both values work independently for the primitive types.
        int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue "+anotherIntValue);

        myIntValue++;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue "+anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue " + myIntValue);
        System.out.println("anotherIntValue "+anotherIntValue);

        // arrays are reference types, variables reference to the memory address
        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+ Arrays.toString(anotherArray));

        for(int i = 0; i<myIntArray.length; i++){
            myIntArray[i] = i;
        }

        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+ Arrays.toString(anotherArray));

        for(int i = 0; i<anotherArray.length; i++){
            anotherArray[i] = i+5;
        }

        System.out.println("after change");
        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+ Arrays.toString(anotherArray));


        anotherArray = new int[] {1,2,3,4,5};

        System.out.println("after dereference");
        System.out.println("myIntArray "+ Arrays.toString(myIntArray));
        System.out.println("anotherArray "+ Arrays.toString(anotherArray));


    }

}
