package com.company;

public class BiggerGreater {
    public static void main(String[] args) {


        System.out.println( biggerIsGreater("ab") );
    }

    static String biggerIsGreater(String w) {

        char[] wArr = new char[w.length()];

        for(int i =0 ; i< w.length(); i++){
            wArr[i] = w.charAt(i);
        }

        for(char c: wArr){
            System.out.println(c);
        }

        return "";

    }


}
