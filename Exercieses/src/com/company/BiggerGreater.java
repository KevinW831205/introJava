package com.company;

public class BiggerGreater {
    public static void main(String[] args) {


        System.out.println(biggerIsGreater("ab"));
        System.out.println(biggerIsGreater("bb"));
        System.out.println(biggerIsGreater("hefg"));
        System.out.println(biggerIsGreater("dhck"));
        System.out.println(biggerIsGreater("dkhc"));
        System.out.println(biggerIsGreater("abcfdda"));

    }

    static String biggerIsGreater(String w) {

        boolean foundGreater = false;
        int indexOfNotIncreasing = -1;
        String result = "";

        for (int i = w.length() - 2; i >= 0; i--) {
            if (w.charAt(i) < w.charAt(i+1)){
                foundGreater = true;
                indexOfNotIncreasing = i;

                String left = w.substring(0,indexOfNotIncreasing);
                String right = w.substring(indexOfNotIncreasing);


                if(!left.equals("")){
                    char pivot = left.charAt(left.length()-1);
                    System.out.println(pivot);

                } else {

                }
                break;
            }
        }

        if (foundGreater) {



        } else {
            return "no answer";
        }


        return result;

    }


}
