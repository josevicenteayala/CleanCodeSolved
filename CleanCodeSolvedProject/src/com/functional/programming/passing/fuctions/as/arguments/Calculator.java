package com.functional.programming.passing.fuctions.as.arguments;

import java.util.function.BiFunction;

public class Calculator {

    public Integer calculateBiOperation(BiFunction<Integer, Integer, Integer> mathOperation, Integer firstNumber, Integer secondNumber){
        return mathOperation.apply(firstNumber, secondNumber);
    }
    private BiFunction<Integer,Integer, Integer> diffOperation = (x,y)-> x-y;
    private BiFunction<Integer,Integer, Integer> sumOperation = (x,y)-> x+y;
    private BiFunction<Integer,Integer, Integer> multiplyOperation = (x,y)-> x*y;
    private BiFunction<Integer,Integer, Integer> divisionOperation = (x,y)-> x/y;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Sum operation");
        System.out.println(calculator.calculateBiOperation(calculator.sumOperation, 4,4));
        System.out.println("Diff operation");
        System.out.println(calculator.calculateBiOperation(calculator.diffOperation, 4,4));
        System.out.println("Division operation");
        System.out.println(calculator.calculateBiOperation(calculator.diffOperation, 4,4));
        System.out.println("Multiply operation");
        System.out.println(calculator.calculateBiOperation(calculator.multiplyOperation, 4,4));
    }

}
