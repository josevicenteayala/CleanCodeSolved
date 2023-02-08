package com.functional.programming.real.example;

public class Person {
    private String name;
    private Integer age;

    Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("The name is %s, and the age is %s", name, age);
    }
}
