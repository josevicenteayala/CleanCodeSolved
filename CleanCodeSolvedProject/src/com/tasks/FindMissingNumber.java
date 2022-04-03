package com.tasks;

import java.util.Arrays;
import java.util.List;

/**
 * Given an array of numbers containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * */
public class FindMissingNumber {

    public static void main(String[] args) {
        int[] numbers = {1,2,3,5};
        int sum = Arrays.stream(numbers).sum();
        System.out.println(sum);
    }

    int findMissingNumber(List<Integer> list, int maxSize) {
        int missingNumber = 0;
        for(int i = 1; i < maxSize; i++) {
            missingNumber = i != list.get(i-1) ? i : 0;
            if(missingNumber != 0) return missingNumber;
        }
        return missingNumber;
    }

    int findMissingNumberEnhance(List<Integer> list) {
        Integer maxNumber = list.size() + 1;
        int sumExpected = (maxNumber * (maxNumber + 1)) / 2;

        Integer sum = list.stream().reduce(0, Integer::sum);

        return sumExpected - sum;
    }
}