package com.company;

public class Encryption {
    public static void main(String[] args) {
        encryption("asdf");
    }

    static String encryption(String s) {
        int row = (int) Math.floor(Math.sqrt(s.length()));
        int col = (int) Math.ceil(Math.sqrt(s.length()));

        char[][] encrypted = new char[row][];

        encrypted[0] = new char[col];

        for(int i=0; i<s.length(); i++){
            System.out.println(s.charAt(i));

        }

        return "";
    }

}
