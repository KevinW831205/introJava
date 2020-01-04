package com.company.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("e1 ee", 21);
        Employee e2 = new Employee("a2 aa", 22);
        Employee e3 = new Employee("h3 hh", 23);
        Employee e4 = new Employee("c4 cc", 24);
        Employee e5 = new Employee("f5 ff", 25);
        Employee e6 = new Employee("g6 gg", 26);

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

//
//        printEmployeesByAge(employees,"Employees over 23", employee -> employee.getAge()>23);
//        printEmployeesByAge(employees,"Employees 23 and under", employee -> employee.getAge()<=23);
//
//        printEmployeesByAge(employees, "Employees under 22", new Predicate<Employee>() {
//            @Override
//            public boolean test(Employee employee) {
//                return employee.getAge()<22;
//            }
//        });
//
//        IntPredicate greaterThan15 = i -> i>15;
//        IntPredicate lessThan100 = i -> i<100;
//        System.out.println(greaterThan15.test(10));
//        int a =20;
//        System.out.println(greaterThan15.test(a+5));
//
//        System.out.println( greaterThan15.and(lessThan100).test(50) );
//        System.out.println( greaterThan15.and(lessThan100).test(1000) );
//
//        Random random = new Random();
//        Supplier<Integer> randomSupplier = () -> random.nextInt(1000);
//
//        for(int i=0; i<10 ;i++){
////            System.out.println(random.nextInt(1000));
//            System.out.println(randomSupplier.get());
//        }


        employees.forEach(employee -> {
            String lastName = employee.getName().substring(employee.getName().indexOf(' ')+1);
            System.out.println("Last Name is: "+lastName);
        });

        Function<Employee, String> getLastName = (Employee employee) ->{
            return employee.getName().substring(employee.getName().indexOf(' ')+1);
        };

        String lastName = getLastName.apply(employees.get(1));
        System.out.println(lastName);

        Function<Employee, String> getFirstName = (employee -> {
            return employee.getName().substring(0,employee.getName().indexOf(' '));
        });

        Random random1 = new Random();
        for(Employee employee: employees){
            if(random1.nextBoolean()){
                System.out.println(getAName(getFirstName, employee));
            } else {
                System.out.println(getAName(getLastName, employee));
            }
        }

        Function<Employee,String> upperCase = employee -> employee.getName().toUpperCase();
        Function<String, String> firstName = name -> name.substring(0,name.indexOf(' '));
        Function chainedFunction = upperCase.andThen(firstName);

        System.out.println("Chained Function "+chainedFunction.apply(employees.get(0)));


        BiFunction<String, Employee, String> concatAge = (String name, Employee employee) ->{
            return name.concat(" "+employee.getAge());
        };

        String upperName = upperCase.apply(employees.get(0));
        System.out.println("BiFunction "+ concatAge.apply(upperName,employees.get(0)));

        IntUnaryOperator incBy5 = i -> i+5;
        System.out.println(incBy5.applyAsInt(10));

        Consumer<String> c1 = s -> s.toUpperCase();
        Consumer<String> c2 = s -> System.out.println(s);
        c1.andThen(c2).accept("Hello World");
    }

    private static String getAName(Function<Employee, String> getName, Employee employee){
        return getName.apply(employee);
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
