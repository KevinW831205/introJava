package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int score1 = calculateScore("aaa",100);
////        int score2 = calculateScore("aaa",100,2);
////        int score3 = calculateScore(100,3);
////        System.out.println("score1 " + score1+ " score2 "+score2+" score3 "+score3);


        conversion.calcFeetAndInchesToCentimeters(12,3);
        conversion.calcFeetAndInchesToCentimeters(0,34);
        conversion.calcFeetAndInchesToCentimeters(2,5);
        conversion.calcFeetAndInchesToCentimeters(5,5);
        conversion.calcFeetAndInchesToCentimeters(1,3);

    }

    public static int calculateScore (String name, int score){
        System.out.println("player" + name + " scored "+ score);
        return score*1000;
    }

    public static int calculateScore(String name, int score, int bonus){
        System.out.println("player " + name + " scored "+ score);
        return score*1000*bonus;
    }

    public static int calculateScore(int score, int bonus){
        return score*1000*bonus;
    }
}
