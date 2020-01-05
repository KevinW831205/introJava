package com.company.Practice;

import java.util.function.Function;

public class Problem2 {
//    public static String everySecondChar(String source) {
//        StringBuilder returnVal = new StringBuilder();
//        for (int i = 0; i < source.length(); i++) {
//            if (i % 2 == 1) {
//                returnVal.append(source.charAt(i));
//            }
//        }
//        return returnVal.toString();
//    }


    public static void main(String[] args) {

        Function<String, String> solution = (String source) -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < source.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(source.charAt(i));
                }
            }
            return returnVal.toString();
        };

//        System.out.println(solution.apply("1234567890"));

        String x = everySecondChar(solution, "1234");
        System.out.println(x);

    }

    public static String everySecondChar(Function<String,String> func, String s){
        return func.apply(s);
    }


}
