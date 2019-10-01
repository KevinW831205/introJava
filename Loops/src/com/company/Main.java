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
//        System.out.println(SumOddRange.sumOdd(-1,3));
//        System.out.println(SumOddRange.sumOdd(10,10));

//            int count = 0;
//            while(count != 5){
//                System.out.println(count);
//                count++;
//            }
//
//            count = 0;
//            while(true){
//                System.out.println(count);
//                count++;
//                if(count==5){
//                    break;
//                }
//            }
//
//        int count = 6;
//        // executes once
//            do {
//                System.out.println(count);
//                count ++;
//            }while (count < 5);


//        int number = 4;
//        int end = 28;
//
//        while(number <= end){
//            number++;
//            if(!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//
//        }

        sum5even(4,28);

        
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate/100));
    }

    public static boolean isEvenNumber(int a){

        if(a%2 == 0){
            return true;
        } else {
            return false;
        }

    }

    public static void sum5even (int start, int end){
        int number = start;
        int evens = 0;
        String total =  "";
        while(number <= end){
            number++;
            if(!isEvenNumber(number)){
                continue;
            }

            evens ++;
            System.out.println(number);

            if(evens == 5){
                total += number;
                System.out.println("5 evens: "+total);
                break;
            }
            total += number + ", ";


        }



    }


}
