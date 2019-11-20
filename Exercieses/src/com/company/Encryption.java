package com.company;

public class Encryption {
    public static void main(String[] args) {
        System.out.println(encryption("haveaniceday"));
        System.out.println(encryption("feedthedog"));
        System.out.println(encryption("chillout"));
    }

    static String encryption(String s) {


        int rows = (int) Math.floor(Math.sqrt(s.length()));
        int cols = (int) Math.ceil(Math.sqrt(s.length()));
        if(rows*cols < s.length()){
            rows = (int) Math.ceil(Math.sqrt(s.length()));
        }

        System.out.println("rows "+rows);
        System.out.println("cols "+cols);

        char[][] encrypted = new char[rows][];

        int rowPos = 0;
        int colPos = 0;

        encrypted[rowPos] = new char[cols];

        for (int i = 0; i < s.length(); i++) {
            encrypted[rowPos][colPos] = s.charAt(i);

            colPos++;

            if (colPos == cols) {
                colPos = 0;
                rowPos++;
//                System.out.println("rowpos");
                if (rowPos < rows) {
                    encrypted[rowPos] = new char[cols];
                }
            }
        }



        String eResult = "";
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                if (encrypted[i][j] != '\u0000') {
                    eResult += encrypted[i][j];
                }
            }
            eResult += " ";
        }
        return eResult;
    }

}
