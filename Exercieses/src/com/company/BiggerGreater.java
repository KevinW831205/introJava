package com.company;

public class BiggerGreater {
    public static void main(String[] args) {


        System.out.println(biggerIsGreater("ab"));
        System.out.println(biggerIsGreater("bb"));
        System.out.println(biggerIsGreater("hefg"));
        System.out.println(biggerIsGreater("dhck"));
        System.out.println(biggerIsGreater("dkhc"));
        System.out.println(biggerIsGreater("abdc"));
        System.out.println(biggerIsGreater("abcfdda"));

    }

    static String biggerIsGreater(String w) {

        String result = "";

        for (int i = w.length() - 1; i > 0; i--) {
            if (w.charAt(i) > w.charAt(i - 1)) {

                String left = w.substring(0, i-1);
                String right = w.substring(i-1);


                char pivot = right.charAt(0);

                for (int j = right.length()-1; j >= 0; j--) {
                    if (right.charAt(j)> pivot) {
                        StringBuilder rightSB = new StringBuilder(right);
                        char temp = rightSB.charAt(j );
                        rightSB.setCharAt(j , pivot);
                        rightSB.setCharAt(0, temp);

                        result = left + rightSB.charAt(0);

                        rightSB.delete(0, 1);
                        right = rightSB.reverse().toString();
                        return result + right;
                    }

                }


                StringBuilder rightSB = new StringBuilder(right);
                return left + rightSB.reverse().toString();
            }
        }

        return "no answer";

    }


}
