package com.functional.programming.streams.project;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Company {
    private Employee[] employees;

    public Company(){
        employees = new Employee[]{
                new Employee("Jose", 47, "Developer", 100.0f),
                new Employee("Hernando", 35, "Developer", 90.0f),
                new Employee("Hugo", 27, "Tester", 98.0f),
                new Employee("Lucia", 24, "Tester", 98.0f),
                new Employee("Mario", 29, "Sales Executive", 150.0f),
                new Employee("Pedro", 45, "Writer", 200.0f),
                new Employee("Maria", 25, "Writer", 210.0f),
                new Employee("Jorge", 32, "Designer", 95.0f),
                new Employee("Marcela", 21, "Designer", 90.0f),
                new Employee("Sergio", 50, "Business Analyst", 150.0f),
                new Employee("Felipe", 21, "Devops", 120.0f)
        };
    }

    public List<Employee> getEmployees(){
        return Arrays.asList(employees);
    }

    public static void main(String[] args) {
        Company company = new Company();
        Map<String, Float> averagaSalaryMap = company.getEmployees()
                .stream()
                .collect(Collectors.groupingBy((employee)->employee.getJobTitle()))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        (entry) -> entry.getKey(),
                        (entry) -> entry.getValue()
                                .stream()
                                .map((employee -> employee.getSalary()))
                                .reduce(0f, (acc, salary)-> acc + salary) / entry.getValue().size()
                ));

        System.out.println(averagaSalaryMap);
    }

}
