package com.company;

import java.util.ArrayList;

public class AppendAndDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerrank", "hackerhappy", 9) );
        System.out.println(appendAndDelete("aba","aba",7) );
        System.out.println(appendAndDelete("ash","ashley",2) );

    }

    public static String appendAndDelete(String s, String t, int k){

        int commonLength = 0;

        for(int i=0; i< Math.min(s.length(),t.length()); i++){
            if(s.charAt(i) == t.charAt(i)){
                commonLength++;
            } else {
                break;
            }
        }

        if(s.length()+t.length()-2*commonLength > k){
            return "No";
        } else if((s.length()+t.length()-2*commonLength)%2 == k%2){
            return "Yes";
        } else if(s.length()+t.length()-k <0){
            return "Yes";
        } else{
            return "No";
        }

    }

}
