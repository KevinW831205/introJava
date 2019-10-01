package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number > 0) {
            int reversed = reverse(number);
            int digits = getDigitCount(number);
            int count = 0;

            while (reversed > 0) {
                switch (reversed % 10) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                    default:
                        System.out.println("Invalid");
                        break;
                }
                reversed /= 10;
                count++;
            }

            for (int i = count; i < digits; i++) {
                System.out.println("Zero");
            }
        } else if(number ==0){
            System.out.println("Zero");
        }else
        {
            System.out.println("Invalid Value");
        }


    }

    public static int reverse(int number) {
        int reversed = 0;
        while(number!=0){
            reversed = reversed*10 + number%10;
            number/=10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int digits = 0;
        do {
            digits++;
            number /= 10;
        }while(number>0); // for case number = 0;
        return digits;
    }


}
