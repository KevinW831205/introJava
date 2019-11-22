package com.company;

public class KaprekarNumbers {

    public static void main(String[] args) {

//        kaprekarNumbers(1,100)
        kaprekarNumbers(1,100);
    }

    static void kaprekarNumbers(int p, int q) {
        for(int i = p; i<=q; i++){
            int squared = i*i;
            int digits = (int) Math.log10(i) +1;

            String right = squared + "";
            right = right.substring(right.length()-digits);
            String left = squared + "";
            left = left.substring(0,left.length()-digits);





        }

    }

}
