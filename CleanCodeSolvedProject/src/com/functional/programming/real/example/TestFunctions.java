package com.functional.programming.real.example;

public class TestFunctions {
    public static void main(String[] args) {
        final Boolean isDevelopment = true;
        DataLoader dataLoader = new DataLoader(isDevelopment);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
