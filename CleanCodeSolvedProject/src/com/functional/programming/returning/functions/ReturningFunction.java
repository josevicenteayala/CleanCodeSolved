package com.functional.programming.returning.functions;

import com.functional.programming.NoArgFunction;

public class ReturningFunction {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createHelloWorld = ()-> ()-> "Hello there, this is working!";
        NoArgFunction<String> helloDemo = createHelloWorld.apply();
        System.out.println(helloDemo.apply());
    }
}
