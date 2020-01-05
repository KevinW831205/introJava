package com.company.Practice;

import java.util.function.Supplier;

public class problem3 {

    public static void main(String[] args) {

        Supplier<String> printS3 = ()->"I love java";

        System.out.println(printS3.get());
    }
}
