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

        int indexOfNotIncreasing = -1;
        String result = "";

        for (int i = w.length() - 2; i >= 0; i--) {
            if (w.charAt(i) < w.charAt(i + 1)) {
                indexOfNotIncreasing = i+1;

                String left = w.substring(0, indexOfNotIncreasing);
                String right = w.substring(indexOfNotIncreasing);
                
                if (!left.equals("")) {
                    char pivot = left.charAt(left.length() - 1);

                    for(int j=0; j<right.length(); j++){
                        if(right.charAt(j) < pivot){
                            left = left.substring(0, left.length()-1) + right.charAt(j-1);

                            StringBuilder rightSB = new StringBuilder(right);
                            rightSB.setCharAt(j-1, pivot);
                            right = rightSB.reverse().toString();

                            return left+right;
                        }
                    }

                } else {
                    result = new StringBuilder(right).reverse().toString();
                    return result;
                }
                break;
            }
        }

        return "no answer";


    }


}
