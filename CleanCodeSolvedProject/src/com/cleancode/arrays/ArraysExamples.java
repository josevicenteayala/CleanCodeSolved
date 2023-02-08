package com.cleancode.arrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Write a function that takes an array of Integers as a param, and returns a list of Integers without duplicates.
 */
public class ArraysExamples {

    public static void main(String[] args) {
        Integer[] numbers = new Integer[]{1,8,9,3,1,2,2,4,5,6,7,7,9,10};


        Integer iArr[] = {1,2,3,3,4,4,6,5,6};

        List<Integer> uniques = listWithoutDuplicates(iArr);
        System.out.println(uniques);

        /** int[] numbersInt = new int[]{1,8,9,3,1,2,2,4,5,6,7,7,9,10};
        System.out.println("deduplicateIntegers::: " + deduplicateIntegers(numbers));

        //Sort the array
        System.out.println("Sorted using sortCollection " + sortCollection(numbers));
        //Sort the array
        System.out.println("Sorted using sortCollectionUsingStreams " + sortCollectionUsingStreams(numbers));
        //Sort the array
        System.out.println("Sorted using sortCollectionUsingStreams2 " + sortCollectionUsingStreams2(numbers));

        System.out.println(eliminateDuplicates(numbersInt));

        System.out.println(removeDuplicates(numbersInt));

        System.out.println(getValues(numbers));*/
    }

    public static List<Integer> listWithoutDuplicates(Integer[] array){
        Set<Integer> integerSet = new HashSet();
        for(int a: array){
            integerSet.add(a);

        }
        return integerSet.stream().collect(Collectors.toList());
    }

    private static List<Integer> getUniques(Integer[] numbers) {
        List<Integer> toReturn = new ArrayList<>();
        List<Integer> added = new ArrayList<>();
        for(int i=0; i<numbers.length; i++) {
            int number = numbers[i];
            if (!added.contains(number)) {
                toReturn.add(number);
                added.add(number);
            }
        }
        return toReturn;
    }

    private static Set<Integer> removeDuplicate(Integer iArr[]){
        Set<Integer> set = new HashSet<>();
        for(Integer i:iArr){
            set.add(i);
        }

        return set;
    }

    static List<Integer> getValues(Integer[] num){

        List<? extends Integer> listnum = new ArrayList<>();

        listnum = Arrays.asList(num);

        Set<Integer> setNum= new HashSet(listnum);

        List<Integer> withOutDuplistnum= new ArrayList(setNum);

        return withOutDuplistnum;


    }

    public static List eliminateDuplicates(int[] arr){
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for(int i=0; i<arr.length;i++){
            hashSet.add(arr[i]);
        }

        return new ArrayList<Integer>(hashSet);
    }

    public static List<Integer> removeDuplicates(int arr[]){

        HashSet<Integer> hs = new HashSet<Integer> ();
        ArrayList<Integer> al = new ArrayList();
        for(int i:arr){
            if(!hs.contains(i)){
                hs.add(i);
                al.add(i);
            }
        }

        return al;
    }

    /**
     * This function takes an array of integers as a param, and returns a list without duplicates.
     * @param arrayNumbers
     * @return
     */
    public static List<Integer> deduplicateIntegers(Integer[] arrayNumbers){
        return Arrays.stream(arrayNumbers).distinct().collect(Collectors.toList());
        ///return Arrays.asList(arrayNumbers).stream().distinct().collect(Collectors.toList());
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
