package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 5000;
        int level = 2;
        int bonus = 100;

        if(gameOver){
            System.out.println("Game Over");
            int finalScore =  score + level*bonus;
            System.out.println("Your score " + finalScore);
        } else if(level == 1 && !gameOver){
            System.out.println("game start");
            System.out.println("level " + level);
        } else {
            System.out.println("level " + level);
            System.out.println("current bonus "+bonus);
        }


        //scope test
//        System.out.println(finalScore);

        score = 10000;
        level = 8;
        bonus = 200;
        int finalScore = score+level*bonus;
        System.out.println("second score "+finalScore );


    }
}
