package com.cleancode.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysExamples {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1,8,9,3,1,2,2,4,5,6,7,7,9,10};
        System.out.println(deduplicateIntegers(numbers));

        //Sort the array
        System.out.println("Sorted using sortCollection " + sortCollection(numbers));
        //Sort the array
        System.out.println("Sorted using sortCollectionUsingStreams " + sortCollectionUsingStreams(numbers));
        //Sort the array
        System.out.println("Sorted using sortCollectionUsingStreams2 " + sortCollectionUsingStreams2(numbers));
    }

    public static List<Integer> deduplicateIntegers(Integer[] arrayNumbers){
        return Arrays.asList(arrayNumbers).stream().distinct().collect(Collectors.toList());
    }

    public static List<Integer> sortCollection(Integer[] numbers){
        Arrays.sort(numbers);
        return Arrays.asList(numbers);
    }

    public static List<Integer> sortCollectionUsingStreams(Integer[] numbers){
        return Arrays.asList(numbers).stream().sorted().collect(Collectors.toList());
    }

    public static List<Integer> sortCollectionUsingStreams2(Integer[] numbers){
        Comparator<Integer> comparator = (integer, t1) -> {
            if(integer < t1) return -1;
            else if (integer > t1) return 1;
            else return 0 ;
        };
        return Arrays.asList(numbers).stream().sorted(comparator).collect(Collectors.toList());
    }
}
