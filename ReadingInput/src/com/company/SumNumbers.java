package com.company;

import java.util.Scanner;

public class SumNumbers {

    public static int sum10numbers (){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        int numbersIn = 1;

        while (numbersIn<=10){
            System.out.println("Enter number #"+numbersIn+" to add");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt){
                int inputNumber = scanner.nextInt();
                sum += inputNumber;
                numbersIn++;
                System.out.println("added "+inputNumber+" to sum, current sum = "+ sum );
            } else{
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); // handles enter to confirm
        }

        System.out.println("10 numbers inputted, total sum "+sum);
        scanner.close();
        return sum;
    }
}
