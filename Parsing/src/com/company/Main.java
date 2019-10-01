package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String numStr = "1354";
        System.out.println("numStr "+numStr);
        numStr+=34;
        System.out.println("add 34 "+numStr);

        numStr="1354";
        int numStrNum = Integer.parseInt(numStr);
        System.out.println("numStrNum "+numStrNum);
        numStrNum+=34;
        System.out.println("add 34 "+numStrNum);

        numStr = "1354";
        double numStrDouble = Double.parseDouble(numStr);
        System.out.println("numStrDouble "+numStrDouble);
        numStrDouble+=0.34;
        System.out.println("add 0.34 "+numStrDouble);

    }
}
