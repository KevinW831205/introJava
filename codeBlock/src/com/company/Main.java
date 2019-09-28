package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;
        int score = 5000;
        int level = 2;
        int bonus = 100;

        calculateScore(gameOver,score,level,bonus);

        calculateScore(false,0,0,0);

        calculateScore(true,1000,5,300);

        int finalScore = calculateScoreWReturn(gameOver,score,level,bonus);
        System.out.println("calculate with return " + finalScore);

        finalScore = calculateScoreWReturn (false,score,level,bonus);
        System.out.println("calculate with return " + finalScore);


//        if(gameOver){
//            System.out.println("Game Over");
//            int finalScore =  score + level*bonus;
//            System.out.println("Your score " + finalScore);
//        } else if(level == 1 && !gameOver){
//            System.out.println("game start");
//            System.out.println("level " + level);
//        } else {
//            System.out.println("level " + level);
//            System.out.println("current bonus "+bonus);
//        }
//
//
//        //scope test
////        System.out.println(finalScore);
//
//        score = 10000;
//        level = 8;
//        bonus = 200;
//        int finalScore = score+level*bonus;
//        System.out.println("second score "+finalScore );
    }

    public static void calculateScore(boolean gameOver, int score, int level, int bonus){
        if(gameOver){
            int finalScore = score+level*bonus;
            System.out.println("score " + finalScore);

        }
    }

    public static int calculateScoreWReturn(boolean gameOver, int score, int level, int bonus){
        if(gameOver){
            int finalScore = score+level*bonus;
            return finalScore;
        }
        return -1;
    }
}
