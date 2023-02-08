package com.cleancode.functions;

import java.util.Arrays;
import java.util.List;

public class Operators {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(3, 5, 8, 9, 12);

        int sum = values.stream()
                .reduce(0, (i1, i2) -> i1 + i2);

        System.out.println(sum);
    }

}
