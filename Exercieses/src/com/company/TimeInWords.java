package com.company;

public class TimeInWords {

    public static void main(String[] args) {
        System.out.println(timeInWords(3, 00) + " expected three o'clock");
        System.out.println(timeInWords(7, 15) + " expected fifteen past seven");

    }

    static String timeInWords(int h, int m) {

        String[] numNames = {
                "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen","fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
                "twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight","twenty nine"
        };

        if (m == 0) {
            return
        } else if (m < 30) {

            return
        } else if (m == 30) {

            return
        } else if (m < 60) {

            return
        } else {
            return "Invalid Input";
        }

    }


}
