package com.company;

public class Encryption {
    public static void main(String[] args) {
        encryption("asdf");
    }

    static String encryption(String s) {
        int rows = (int) Math.floor(Math.sqrt(s.length()));
        int cols = (int) Math.ceil(Math.sqrt(s.length()));

        char[][] encrypted = new char[rows][];

        int rowPos = 0;
        int colPos = 0;

        for (int i = 0; i < s.length(); i++) {
            System.out.println("i" + i);
            System.out.println("colpos " + colPos);
            System.out.println("rowpos " + rowPos);
            encrypted[rowPos] = new char[cols];
            encrypted[rowPos][colPos] = s.charAt(i);
            System.out.println(s.charAt(i));
            colPos++;

            if (colPos == cols) {
                colPos = 0;
                rowPos++;
            }
        }

        System.out.println(encrypted[0][0]);

        for (int i = 0; i < encrypted.length; i++) {
            for (int j = 0; j < encrypted.length; j++) {
                System.out.println(encrypted[i][j]);
            }
        }

        return "";
    }

}
