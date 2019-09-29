package com.company;

public class Week {

    public static void printDayOfTheWeek(int num) {
        switch (num) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");

        }


    }

    public static void printDayOfTheWeekSL(int num) {
        if (num == 0) {
            System.out.println("Sunday");
        } else if (num == 1) {
            System.out.println("Monday");

        } else if (num == 2) {
            System.out.println("Tuesday");

        } else if (num == 3) {
            System.out.println("Wednesday");

        } else if (num == 4) {
            System.out.println("Thursday");

        } else if (num == 5) {
            System.out.println("Friday");

        } else if (num == 6) {
            System.out.println("Saturday");

        } else {
            System.out.println("Invalid Day");

        }


    }
}
