package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int minVal = Integer.MIN_VALUE;
        int maxVal = Integer.MAX_VALUE;
        double maxDouble = Double.MAX_VALUE;
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        System.out.println("Min = " + minVal );
        System.out.println("Max = " + maxVal);
        System.out.println("max double = "+maxDouble);
        System.out.println("max byte = " + maxByte);

        short maxShort = Short.MAX_VALUE;
        System.out.println("max short = " + maxShort);

        long testLong = 1234567891234L;

        byte newMinByte = (byte) (minByte-1);
        System.out.println(newMinByte);;
    }
}
