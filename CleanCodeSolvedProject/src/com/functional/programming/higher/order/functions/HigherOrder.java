package com.functional.programming.higher.order.functions;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HigherOrder {
    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x,y)-> x/y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> validateDenominator =
                (func) -> (x,y)-> {
            if(y == 0f){
                System.out.println("Error: denominator is less than zero");
                return 0f;
            }
            return func.apply(x,y);
                };

        BiFunction<Float, Float, Float> divideSafe = validateDenominator.apply(divide);
        Float result = divideSafe.apply(30f, 0f);
        System.out.println(result);

    }
}
