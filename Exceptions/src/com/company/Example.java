package com.company;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("unable to perform division");
        }

    }

    private static int divide(){

//        int x = getInt();
//        int y = getInt();

//        int x;
//        try {
//            x = getInt();
//        } catch (NoSuchElementException e){
//            x = getInt();
//        }
//        int x,y;
//
//        try{
//            x = getInt();
//            y =getInt();
//            System.out.println("x is "+x+", y is "+y);
//            return x/y;
//        } catch (NoSuchElementException e){
//            throw new ArithmeticException("no suitable input");
//        } catch (ArithmeticException e){
//            throw new ArithmeticException("attempt to divide by zero");
//        }
        int x,y;
        x = getInt();
        y =getInt();
        System.out.println("x is "+x+", y is "+y);
        return x/y;


    }

    private static int getInt(){
        Scanner s = new Scanner(System.in);
        System.out.println("please enter an integer");
        while (true){
            try{
                return s.nextInt();
            } catch (InputMismatchException e){
                s.nextLine();
                System.out.println("Invalid, Please enter an integer");
            }
        }
    }
}
