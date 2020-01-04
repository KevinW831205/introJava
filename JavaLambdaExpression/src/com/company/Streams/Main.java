package com.company.Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
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

        Employee e1 = new Employee("e1",26);
        Employee e2 = new Employee("g1",39);
        Employee e3 = new Employee("b1",24);
        Employee e4 = new Employee("s1",53);
        Employee e5 = new Employee("f1",27);

        Department hr = new Department("Human Resource");
        hr.addEmployee(e1);
        hr.addEmployee(e2);
        hr.addEmployee(e3);

        Department accounting = new Department("Accounting");
        accounting.addEmployee(e4);
        accounting.addEmployee(e5);

        List<Department>departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream().flatMap(department -> department.getEmployees().stream())
                .forEach(System.out::println);

        List<String> sortedGNumbers = bingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s -> s.startsWith("G"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("--------------------");
        for(String s : sortedGNumbers){
            System.out.println(s);
        }

    }
}
