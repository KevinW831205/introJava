package com.company.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopNames {
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                "Amelia",
                "Olivia",
                "emily",
                "Isla",
                "Ava",
                "oliver",
                "Jack",
                "Charlie",
                "harry",
                "Jacob"
        );

        List<String> firstUpperCase = new ArrayList<>();
        topNames2015.forEach(name ->
                firstUpperCase.add(name.substring(0, 1).toUpperCase() + name.substring(1))
        );
        firstUpperCase.sort(String::compareTo);
        firstUpperCase.forEach(System.out::println);


        System.out.println("-----------------");
        topNames2015.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------------");
        topNames2015.stream()
                .filter(name -> name.toUpperCase().startsWith("A"))
                .forEach(System.out::println);


        long numberOfNamesBeginWithA = topNames2015.stream()
                .filter(name -> name.toUpperCase().startsWith("A"))
                .count();

        System.out.println(numberOfNamesBeginWithA);

        System.out.println("----------------");
        topNames2015.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted()
                .collect(Collectors.toList());
    }
}
