package com.functional.programming.closure;

import com.functional.programming.NoArgFunction;

public class Closure {

    public static void main(String[] args) {
        NoArgFunction<NoArgFunction<String>> createGreater = () -> {
            String name = "Vin";
            return ()-> "Hello, " +name;//the variable name is closure to this new function
        };

        NoArgFunction<String> greeter = createGreater.apply();
        System.out.println(greeter.apply());
    }

}
