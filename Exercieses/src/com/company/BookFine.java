package com.company;

public class BookFine {

    public static void main(String[] args) {

    }

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2){
        if(y2>y1){
            return 10000;
        } else if(y2 == y1){
            if(m2-m1>0){
                return (m2-m1)*500;
            } else if(m2-m1 == 0){
                if(d2-d1>0){
                    return (d2-d1)*15;
                }
            }
        }
        return 0;
    }

}
