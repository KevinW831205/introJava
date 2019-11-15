package com.company;

public class RepeatedString {

    public static void main(String[] args) {
        System.out.println(repeatedString("baaa", 3));
        System.out.println(repeatedString("b",9));
    }

    static long repeatedString(String s, long n) {
        /*
        s = s.toLowerCase();

        int stringLength = s.length();

        long repeats = n / stringLength;
        System.out.println("R"+repeats);

        int numOfFirstChar = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('a' == s.charAt(i)) {
                numOfFirstChar++;
            }
        }

        long results = (long) numOfFirstChar * repeats;
        int remaining = (int) n % stringLength;
        System.out.println("remaining " +remaining);
        for (int i = 0; i < remaining; i++) {
            System.out.println(s.charAt(i));
            if ( 'a' == s.charAt(i)) {
                System.out.println("added");
                results++;
            }
        }

        System.out.println("SL"+stringLength);

        return results;

         */


        long check = 0;
        int i=0,j=0,k=0;
        long count = 0;

        for(i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a')
                count++;
        }

        long div = n/s.length();
        long reminder = n%s.length();

        count = div*count;

        for(i=0; i<reminder; i++){
            if(s.charAt(i) == 'a')
                count++;
        }

        return count;

    }

}
