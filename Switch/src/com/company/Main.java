package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        int switchValue = 2;
//
//        switch(switchValue){
//            case 1:
//                System.out.println("value=1 ");
//                break;
//            case 2: case 3: case 4:
//                System.out.println("value=2 3 or 4");
//                break;
//            case 5:
//                System.out.println("svalue=" + switchValue);
//                break;
//            default:
//                System.out.println("defalut");
//                break;
//        }
//
//        charCheck('F');
//
//        strCheck("Mon");

        Week.printDayOfTheWeek(1);
        Week.printDayOfTheWeekSL(1);
        Week.printDayOfTheWeek(-5);
        Week.printDayOfTheWeekSL(-5);
        Week.printDayOfTheWeek(0);
        Week.printDayOfTheWeekSL(0);


    }

    public static void charCheck(char value){
        switch (value){
            case 'A':
                System.out.println("A character found");
                break;
            case 'B':
                System.out.println("B character found");
                break;
            case 'C':
                System.out.println("C character found");
                break;
            case 'D':
                System.out.println("D character found");
                break;
            case 'E':
                System.out.println("E character found");
                break;
            default:
                System.out.println("character not found");
                break;

        }
    }


    public static void strCheck(String value){
        switch (value.toLowerCase()){
            case "mon":
                System.out.println("Monday");
                break;
            case "tue":
                System.out.println("Tuesday");
                break;
            case "wed":
                System.out.println("Wednesday");
                break;
            case "thu":
                System.out.println("Thursday");
                break;
            case "fri":
                System.out.println("Friday");
                break;
            default:
                System.out.println("don't know");
                break;

        }
    }
}
