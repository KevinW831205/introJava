package com.company.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("e1", 21);
        Employee e2 = new Employee("a2", 22);
        Employee e3 = new Employee("h3", 23);
        Employee e4 = new Employee("c4", 24);
        Employee e5 = new Employee("f5", 25);
        Employee e6 = new Employee("g6", 26);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        employees.add(e6);

//        System.out.println("Employees over 24: ");
//        for(Employee e : employees){
//            if(e.getAge() > 24){
//                System.out.println(e.getName());
//            }
//        }


        /*
        Code to replace with predicate
        System.out.println("Employees over 24: ");
        employees.forEach(employee -> {
            if(employee.getAge()>24){
                System.out.println(employee.getName());
            }
        });

        System.out.println("Employees 24 and under: ");
        employees.forEach(employee -> {
            if(employee.getAge()<=24){
                System.out.println(employee.getName());
            }
        });


         */

//        employees.forEach( employee -> {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        });


        printEmployeesByAge(employees,"Employees over 23", employee -> employee.getAge()>23);
        printEmployeesByAge(employees,"Employees 23 and under", employee -> employee.getAge()<=23);

        printEmployeesByAge(employees, "Employees under 22", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()<22;
            }
        });

        IntPredicate greaterThan15 = i -> i>15;
        IntPredicate lessThan100 = i -> i<100;
        System.out.println(greaterThan15.test(10));
        int a =20;
        System.out.println(greaterThan15.test(a+5));

        System.out.println( greaterThan15.and(lessThan100).test(50) );
        System.out.println( greaterThan15.and(lessThan100).test(1000) );

        Random random = new Random();
        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);

        for(int i=0; i<10 ;i++){
//            System.out.println(random.nextInt(1000));
            System.out.println(randomSupplier.get());
        }



    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition) {
        System.out.println(ageText);
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
