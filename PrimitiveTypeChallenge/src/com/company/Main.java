package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        byte byteVar = Byte.MAX_VALUE;
        short shortVar = Short.MAX_VALUE;
        int intVar = Integer.MAX_VALUE;
        long sum = (long) (byteVar+intVar+shortVar);
        long result = (long) (50000L + 10L * (long) (byteVar+shortVar+intVar));

        long maxLong = Long.MAX_VALUE;
//        System.out.println(maxLong);
//        System.out.println(result);

        float floatVar = (float) 5.25;
        float floatVar2 = 5.25f;

        int intvalue = 5/3;
        float floatvalue = 5f /3f;
        double doublevalue = 5d /3d;
//        System.out.println("INT " + intvalue);
//        System.out.println("Float" + floatvalue);
//        System.out.println("double" + doublevalue);

        double pounds = 220;
        double kilo = pounds * 0.45359237d;
        System.out.println(kilo);


    }
}
