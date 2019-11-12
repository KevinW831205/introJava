package com.company;

public class SherlockSquare {
    public static void main(String[] args) {
        System.out.println( squares(3,9));
    }

    public static int squares(int a,int b){
        int count = (int) Math.floor(Math.sqrt(b)) - (int) Math.floor(Math.sqrt(a));


        if(Math.floor(Math.sqrt(a)) == Math.sqrt(a)){
            count++;
        }

        return count;
    }
}
