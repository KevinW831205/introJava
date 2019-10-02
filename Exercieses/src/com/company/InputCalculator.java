package com.company;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage (){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int numberInputs = 0;
        double average = 0d;

        while (true){
            System.out.println("Enter a number");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int input = scanner.nextInt();
                sum += input;
                numberInputs++;
            }else {
                if(numberInputs != 0) {
                    average = (double)  sum / numberInputs;
                }
                int printAverage = (int) Math.round(average);
                System.out.println("SUM = "+sum +" AVG = " + printAverage);
                break;
            }

        }
        scanner.close();
        return;
    }
}
