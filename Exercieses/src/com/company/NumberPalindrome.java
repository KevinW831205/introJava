package com.company;

public class NumberPalindrome {

    public static boolean isPalindrome(int number){

        if(number<0){
            number = number * -1;
        }

        String reversed = "";
        int reverseNumber = number;


        while (reverseNumber > 0){
            reversed+= reverseNumber%10;
            reverseNumber/=10;
        }

        if(Integer.parseInt(reversed) == number){
            return true;
        }

        return false;



    }
}
