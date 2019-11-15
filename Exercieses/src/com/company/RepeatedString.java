package com.company;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
        System.out.println(repeatedString("aaab",9));
    }

    static long repeatedString(String s, long n) {
        int stringLength = s.length();

        long repeats = n / stringLength;

        int numOfFirstChar = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(0) == s.charAt(i)) {
                numOfFirstChar++;
            }
        }

        long results = (long) numOfFirstChar * repeats;
        int remaining = (int) n % stringLength;
        for (int i = 0; i < remaining; i++) {
            if (s.charAt(0) == s.charAt(i)) {
                results++;
            }
        }

        return results;

    }

}
