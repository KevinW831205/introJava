package com.company.Practice;

import java.util.Arrays;
import java.util.List;

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

        topNames2015.stream()
                .map(s->{
                    String res = ""+s.charAt(0);
                    res = res.toUpperCase();
                    res += s.substring(1);
                    return res;
                })
                .sorted()
                .forEach(System.out::println);
    }
}
