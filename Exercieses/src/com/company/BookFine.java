package com.company;

public class BookFine {

    public static void main(String[] args) {

    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2){
        if(y1>y2){
            return 10000;
        } else if(y2 == y1){
            if(m1-m2>0){
                return (m1-m2)*500;
            } else if(m1-m2 == 0){
                if(d1-d2>0){
                    return (d1-d2)*15;
                }
            }
        }
        return 0;

    }

}
