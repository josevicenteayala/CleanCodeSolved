package com.functional.programming.streams.project;

public class Employee {
    private String name;
    private Integer age;

    private String jobTitle;
    private Float salary;

    Employee(String name, Integer age, String jobTitle, Float salary){
        this.name = name;
        this.age = age;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public Float getSalary() {
        return salary;
    }
}
