package com.company;

public class TimeInWords {

    public static void main(String[] args) {
        System.out.println(timeInWords(3, 00) + " expected three o'clock");
        System.out.println(timeInWords(7, 15) + " expected quarter past seven");
        System.out.println(timeInWords(7,45));
        System.out.println(timeInWords(7,59));
        System.out.println(timeInWords(7,1));
        System.out.println(timeInWords(7,31));
        System.out.println(timeInWords(7,46));



    }

    static String timeInWords(int h, int m) {

        String[] numNames = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
                "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
        };

        if (m == 0) {
            return numNames[h] + " o' clock";
        } else if (m == 1) {
            return numNames[m] + " minute past " + numNames[h];
        } else if (m == 15) {
            return "quarter past " + numNames[h];
        } else if (m < 30) {
            return numNames[m] + " minutes past " + numNames[h];
        } else if (m == 30) {
            return "half past " + numNames[h];
        } else if (m == 45) {
            return "quarter to " + numNames[h+1];
        } else if (m < 59) {
            return numNames[60 - m] + " minutes to " + numNames[h+1];
        } else if(m == 59){
            return "one minute to "+numNames[h+1];
        } else {
            return "Invalid Input";
        }

    }


}
