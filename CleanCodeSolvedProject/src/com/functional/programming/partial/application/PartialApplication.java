package com.functional.programming.partial.application;

import com.functional.programming.TriFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PartialApplication {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> add = (x,y,z) -> x + y + z;
        Function<Integer, BiFunction<Integer, Integer, Integer>> addPartial =
                (x) ->(y,z) -> add.apply(x,y,z);
        BiFunction<Integer, Integer, Integer> add5 = addPartial.apply(5);

        System.out.println(add5.apply(6,7));
    }
}
