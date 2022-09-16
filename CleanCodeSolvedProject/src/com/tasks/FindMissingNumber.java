package com.tasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/** Given an array of numbers containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:

Input: numbers = [3,0,1] Output: 2 Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in numbers.

Example 2:

Input: numbers = [0,1] Output: 2 Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in numbers.

Example 3:

Input: numbers = [9,6,4,2,3,5,7,0,1] Output: 8 Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in numbers.

Example 4:

Input: numbers = [0] Output: 1 Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in numbers.

Constraints:

n == numbers.length
1 <= n <= 104
0 <= numbers[i] <= n
All the numbers of numbers are unique.
*/
public class FindMissingNumber {

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

    int findMissingNumberWithConstraints(List<Integer> numbers){
        Objects.requireNonNull(numbers);
        if(numbers.isEmpty() || numbers.size()>104) {
            return 0;
        }
        /*1 Order the list*/
        List<Integer> listOrdered = numbers.stream().sorted().collect(Collectors.toList());
        /*2 Apply value rule*/
        if(!listOrdered.stream().filter(x -> x > listOrdered.size()).collect(Collectors.toList()).isEmpty()){
            return 0;
        }
        /*3 Read the list*/
        for(int i = 0; i<= listOrdered.size(); i++) {
            if(i == listOrdered.size()){
                return i;
            }
            if(listOrdered.get(i) != i) {
                return i;
            }
        }
        return 0;
    }

    int missingNumber(int[] nums) {

        List<Integer> integerList = Arrays.stream(nums).sorted().boxed().collect(Collectors.toList());
        System.out.println(integerList);

        Arrays.stream(nums).sorted();

        Arrays.sort(nums);

        int found = 0;
        for(int i=0; i<nums.length; i++){
            if(i + 1  == nums.length){
                found = nums[i] + 1;
            }else if(nums[i] + 1 != nums[i + 1]){
                found = nums[i] + 1;
                break;
            }
        }
        return found;
    }
}