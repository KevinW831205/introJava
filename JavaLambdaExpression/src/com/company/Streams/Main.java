package com.company.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> bingoNumbers = Arrays.asList(
                "N40", "N36",
                "B6", "B12",
                "G15", "G34", "G23", "g64",
                "O71",
                "I26"
        );

//        List<String> gNumbers = new ArrayList<>();
//
//        bingoNumbers.forEach((bingoNumber)->{
//            if(bingoNumber.toUpperCase().startsWith("G")){
//                gNumbers.add(bingoNumber);
////                System.out.println(bingoNumber);
//            }
//        });
//
//        gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));
//        gNumbers.forEach((String s)-> System.out.println(s));

//        bingoNumbers
//                .stream()
//                .map(String::toUpperCase)
//                .filter(s -> s.startsWith("G"))
//                .sorted()
//                .forEach(System.out::println);
//
//
//        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "O71");
//        Stream<String> inNumberStream = Stream.of("N40", "N36", "I26", "I29", "I17", "O71");
//        Stream<String> concatStream = Stream.concat(ioNumberStream, inNumberStream);
////        System.out.println(concatStream.count());
//        System.out.println("----------------------");
//        System.out.println(concatStream
//                .distinct()
//                .peek(System.out::println)
//                .count());




    }
}
