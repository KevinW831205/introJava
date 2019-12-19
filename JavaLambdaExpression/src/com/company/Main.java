package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        new Thread(new CodeToRun()).start();
//
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Printing from runnable2");
//            }
//        }).start();
//
//        new Thread(() -> System.out.println("Printing with Lambda Expression")).start();
//
//        new Thread(()->{
//            System.out.println("print1");
//            System.out.println("print2");
//            int x =5;
//            x += 2;
//            System.out.println("x"+x);
//        }).start();

        Employee e1 = new Employee("e1",21);
        Employee e2 = new Employee("a2",22);
        Employee e3 = new Employee("h3",23);
        Employee e4 = new Employee("c4",24);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

//        Collections.sort(employees, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee employee1, Employee employee2) {
//                return employee1.getName().compareTo(employee2.getName());
//            }
//        });

        Collections.sort(employees, (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for(Employee e: employees){
            System.out.println(e.getName());
        }

//        String s1 = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndConcat(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        }, e1.getName() ,e2.getName());
//
//        System.out.println(s1);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();
        String someString = doStringStuff(uc, e1.getName(), e2.getName());
        System.out.println(someString);


    }

    public final static String doStringStuff(UpperConcat uc, String s1, String s2){
        return uc.upperAndConcat(s1,s2);
    }
}


class CodeToRun implements Runnable {
    @Override
    public void run() {
        System.out.println("Printing from runnable");
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}