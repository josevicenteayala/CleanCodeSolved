package com.functional.programming.streams;

import java.util.List;
import java.util.stream.Collectors;

public class MapReview {
    public static void main(String[] args) {
        List<String> stringList = List.of("one", "two", "three", "four");

        List<String> stringListUpperCase = stringList.stream().map((s) -> s.toUpperCase()).collect(Collectors.toList());
        stringListUpperCase.stream().forEach(System.out::println);

    }

}
