package com.company;

public class Encryption {
    public static void main(String[] args) {
        encryption("haveaniceday");
    }

    static String encryption(String s) {
        int rows = (int) Math.floor(Math.sqrt(s.length()));
        int cols = (int) Math.ceil(Math.sqrt(s.length()));

        char[][] encrypted = new char[rows][];

        int rowPos = 0;
        int colPos = 0;

        encrypted[rowPos] = new char[cols];

        for (int i = 0; i < s.length(); i++) {
            encrypted[rowPos][colPos] = s.charAt(i);
//            System.out.println("00"+encrypted[0][0]);
//            System.out.println("01"+encrypted[0][1]);
            System.out.println(encrypted[rowPos][colPos]);
            colPos++;

            if (colPos == cols) {
                colPos = 0;
                rowPos++;
                System.out.println("rowpos");
                if(rowPos < rows){
                    encrypted[rowPos] = new char[cols];
                }
            }
        }







        return "";
    }

}
