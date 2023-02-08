package com.functional.programming;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * -Functional Programming and Object-Oriented Programming are not opposites
 * -Functional programing bring the precision of match into programming
 * -Declarative programming: what things are. It is related to Functional programming
 * -Imperative programming: how the things should work
 * -Core concepts of Functional Programming:
 *      - Immutability:
 *      - Functional purity: None of the functions should refer to any kind of state: they should be pure
 *      - First-class functions: they are similar to another types like Integer, Double, etc
 * -Assigning Functions to Variables
 * -Lambda: it is a shorthand syntax to define new functions without having to define this functions as methods of any give class
 */
public class FunctionalConcepts {

    protected static class MyMath {
        public static Integer triple(Integer x) {
            return x * 3;
        }

        public static Integer multiply(Integer y, Integer x) {
            return y * x;
        }
    }
    public static void main(String[] args) {
        Function<Integer, Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(5);
        System.out.println(result);

        /*BuFunction*/
        BiFunction<Integer, Integer, Integer> myMultiply = MyMath::multiply;
        Integer multiplyResult = myMultiply.apply(2,5);
        System.out.println(multiplyResult);

        BiFunction<Integer, Integer, Integer> myMultiplyV2 = (x , y) -> x * y;
        System.out.println(myMultiplyV2.apply(4,6));

        TriFunction<Integer, Integer, Integer, Integer> myMultiplyBy3 = (x,y,z) -> x * y * z;
        System.out.println(myMultiplyBy3.apply(2,3,4));
    }
}
