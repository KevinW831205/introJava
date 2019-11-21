package com.company;

public class BiggerGreater {
    public static void main(String[] args) {


        System.out.println( biggerIsGreater("ab") );
        System.out.println(biggerIsGreater("bb"));
//        System.out.println(biggerIsGreater());
//        System.out.println(biggerIsGreater());
//        System.out.println(biggerIsGreater());

    }

    static String biggerIsGreater(String w) {

        char[] wArr = new char[w.length()];

        for(int i =0 ; i< w.length(); i++){
            wArr[i] = w.charAt(i);
        }

        char lastChar = wArr[wArr.length-1];
        boolean foundSmaller = false;
        for(int i=wArr.length-2; i>=0; i--){
            if(lastChar > wArr[i]){
                wArr[wArr.length-1] = wArr[i];
                wArr[i]= lastChar;
                foundSmaller =true;
                break;
            }
        }

        if(!foundSmaller){
            return "no answer";
        }

        String result = "";
        for(char c : wArr){
            result += c;
        }

        return result;

    }


}
