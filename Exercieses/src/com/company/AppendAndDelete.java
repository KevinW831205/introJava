package com.company;

import java.util.ArrayList;

public class AppendAndDelete {

    public static void main(String[] args) {
        System.out.println(appendAndDelete("hackerrank", "hackerhappy", 9) );
        System.out.println(appendAndDelete("aba","aba",7) );
        System.out.println(appendAndDelete("ash","ashley",2) );

    }

    public static String appendAndDelete(String s, String t, int k){

        ArrayList<String> s1 = new ArrayList<String>();
        for(String letter : s.split("")){
            s1.add(letter);
        }

        ArrayList<String> t1 = new ArrayList<String>();
        for(String letter : t.split("")){
            t1.add(letter);
        }

        int smaller;
        if(s1.size() < t1.size()){
            smaller = s1.size();
        } else {
            smaller = t1.size();
        }

        int indexEqual = -1;
        for(int i=0; i<smaller; i++){
            if(s1.get(i).equals(t1.get(i))){
                indexEqual = i;
            } else {
                break;
            }
        }

        int minMoves = (s1.size() + t1.size() - indexEqual*2 -2);

        System.out.println(minMoves);
        System.out.println(s1.size() + t1.size());
        if(s1.size() + t1.size() < k){
            return "Yes";
        }

        if(minMoves == k){
            return "Yes";
        } else if(minMoves < k){
            return "Yes";
        } else {
            if((k-minMoves)%2 == 0){
                return "Yes";
            } else {
                return "No";
            }
        }
    }

}
