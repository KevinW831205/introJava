package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Isogram {
    public static void main(String[] args) {

        System.out.println(isIsogram("Dermatoglyphics"));
        System.out.println(isIsogram("Derrmatoglyphics"));

    }

    public static boolean isIsogram(String str){
        ArrayList<String> exists = new ArrayList<String>();
        str = str.toLowerCase();
        String[] letters = str.split("");
        for(String letter : letters){
            if(!exists.contains(letter)){
                exists.add(letter);
            } else {
                return false;
            }
        }

        return true;
    }
}
