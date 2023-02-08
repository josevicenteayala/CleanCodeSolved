package com.functional.programming.streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilteringReview {

    public static final String TWO = "two";

    public static void main(String[] args) {
        List<String> stringList = List.of("one", "two", "three", "four");
        Predicate<String> stringPredicate = (s) -> s.equals(TWO);
        String response = stringList.stream().filter(stringPredicate).collect(Collectors.joining());
        System.out.println(response);

        /*Higher Order function and Predicates*/

        Function<String, Predicate<String>> filterNumber = (number)-> (s) -> s.equals(number);

        String responseFiltered = stringList.stream().filter(filterNumber.apply("four").negate()).collect(Collectors.joining(", "));
        System.out.println(responseFiltered);
    }
}
