package com.company;

import java.util.Scanner;

public class PaintJob {

    private static Scanner scanner = new Scanner(System.in);

    public static void printBucketCount() {


        System.out.println("get bucket type? (1,2,3)");
        int getType = getParameterInt();


        switch (getType) {
            case 1:
                System.out.println("Input height");
                double height = getParameterDouble();
                System.out.println("Input Width");
                double width = getParameterDouble();
                System.out.println("Input area per bucket");
                double areaPerBucket = getParameterDouble();
                System.out.println(getBucketCount(width, height, areaPerBucket));
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid Type");
                break;
        }

        scanner.close();
        return;
    }

    public static double getParameterDouble() {
        boolean hasNextDouble = scanner.hasNextDouble();
        double result = -1;
        if (hasNextDouble) {
            result = scanner.nextDouble();
        } else {
            result = -1;
            System.out.println("Invalid Input");
        }
        return result;
    }

    public static int getParameterInt() {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = scanner.hasNextInt();
        int result = -1;
        if (hasNextInt) {
            result = scanner.nextInt();
        } else {
            System.out.println("Invalid Input");
            result = -1;
        }
        return result;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;

        double bucketsNeeded = (area / areaPerBucket) - (double) extraBuckets;

        return (int) Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;

        double bucketsNeeded = (area / areaPerBucket);

        return (int) Math.ceil(bucketsNeeded);
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double bucketsNeeded = (area / areaPerBucket);

        return (int) Math.ceil(bucketsNeeded);

    }

}
