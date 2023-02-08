package com.functional.programming.reducing;

import java.util.List;

public class ReducingReview {
    public static void main(String[] args) {
        List<String> stringList = List.of("one", "two", "three", "four");

        String reduce = stringList.stream().reduce(" - ", (acc, s) -> {
            System.out.println(acc);
            return acc + s + " + ";
        });
        System.out.println(reduce);
    }
}
