package com.company;

public class KaprekarNumbers {

    public static void main(String[] args) {

//        kaprekarNumbers(1,100)
        kaprekarNumbers(1, 100);
    }

    static void kaprekarNumbers(int p, int q) {

        String result = "";
        for (long i = p; i <= q; i++) {
            long squared = i * i;
            int digits = (int) Math.log10(i) + 1;

            String right = squared + "";
            right = right.substring(right.length() - digits);
            String left = squared + "";
            left = left.substring(0, left.length() - digits);

            int check = Integer.parseInt(right);
            if (!left.equals("")) {
                check += Integer.parseInt(left);
            }

            if (check == i) {
                result += i + " ";
            }
        }

        if (result.equals("")) {
            System.out.println("INVALID RANGE");
        } else {
            System.out.println(result.trim());

        }

    }

}
