package com.company;

public class SpinWords {
    public static void main(String[] args) {

        System.out.println(spinWords("Welcome"));
        System.out.println(spinWords("Hey fellow warriors"));

    }

    public static String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        String result = "";


        for (String word : words) {
            StringBuilder s = new StringBuilder(word);
            if (word.length() >= 5) {
                result += s.reverse() +" ";
            } else {
                result += s +" ";
            }
        }

        return result.trim();
    }



}
