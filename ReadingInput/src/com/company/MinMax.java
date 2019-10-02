package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class MinMax {
    public static void findMinMax (){
        Scanner scanner = new Scanner(System.in);


        int min = -1;
        int max = -1;
        boolean firstLoop = true;


        while (true){
            System.out.println("Enter a number");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt){
                int nextInput = scanner.nextInt();
                if(firstLoop){
                    min = nextInput;
                    max = nextInput;
                    firstLoop = false;
                }

                if(nextInput < min){
                    min = nextInput;
                }
                if(nextInput>max){
                    max = nextInput;
                }
                scanner.nextLine(); // handles enter to confirm

            } else{
                if(firstLoop){
                    System.out.println("no number entered");
                } else{
                    System.out.println("Min " + min +", Max " + max);
                }
                break;
            }
        }

        scanner.close();
    }

}
