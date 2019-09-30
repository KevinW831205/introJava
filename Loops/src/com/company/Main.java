package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        for(int i = 2; i<9; i++){
//            System.out.println(String.format("%.2f",calculateInterest(10000.0, (double) i)));
//        }
//
//        System.out.println("------reverse-------");
//
//        for(int i = 8; i>1; i--){
//            System.out.println(String.format("%.2f",calculateInterest(10000.0, (double) i)));
//        }
//
//        PrimeNumber.ThreePrimeInRange(3,21);
//        int sum =0;
//        int count = 0;
//        for(int i = 1; i <= 1000; i++){
//
//
//            if(i%3 == 0 && i%5 == 0){
//                System.out.println(i);
//                sum += i;
//                count++;
//            }
//
//            if(count == 5){
//                System.out.println("Sum is "+ sum);
//                break;
//            }
//        }
//
        System.out.println(SumOddRange.sumOdd(-1,3));
        System.out.println(SumOddRange.sumOdd(10,10));


    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
