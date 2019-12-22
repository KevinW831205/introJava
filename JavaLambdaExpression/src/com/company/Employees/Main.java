package com.company.Employees;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Employee e1 = new Employee("e1",21);
        Employee e2 = new Employee("a2",22);
        Employee e3 = new Employee("h3",23);
        Employee e4 = new Employee("c4",24);

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        employees.forEach( employee -> {
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        });

    }
}
