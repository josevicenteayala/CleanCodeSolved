package com.tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {

    private static final int POSITION_1 = 1;
    private static final int POSITION_97 = 97;
    private static final int POSITION_60 = 60;
    private FindMissingNumber findMissingNumber;

    @BeforeEach
    void init(){
        findMissingNumber = new FindMissingNumber();
    }

    @Test
    void findMissingNumberWithListUntil100AndMissingNumber60() {
        List<Integer> list = createOrdinalList(100);
        list.remove(POSITION_60);
        int missingNumber = findMissingNumber.findMissingNumber(list, 100);
        assertEquals(60,missingNumber);
    }

    @Test
    void findMissingNumberEnhanceUntil100AndMissingNumber60() {
        List<Integer> list = createOrdinalList(100);
        list.remove(POSITION_60);
        int missingNumberEnhance = findMissingNumber.findMissingNumberEnhance(list);
        assertEquals(60,missingNumberEnhance);
    }

    @Test
    void findMissingNumberWithListUntil100AndMissingNumber99() {
        List<Integer> list = createOrdinalList(100);
        list.remove(POSITION_97);
        int missingNumber = findMissingNumber.findMissingNumber(list,100);
        assertEquals(99,missingNumber);
    }

    @Test
    void findMissingNumberEnhanceUntil100AndMissingNumber99() {
        List<Integer> list = createOrdinalList(100);
        list.remove(POSITION_97);
        int missingNumberEnhance = findMissingNumber.findMissingNumberEnhance(list);
        assertEquals(99,missingNumberEnhance);
    }

    @Test
    void findMissingNumberWithListUntil100AndMissingNumber1() {
        List<Integer> list = createOrdinalList(100);
        list.remove(POSITION_1);
        int missingNumber = findMissingNumber.findMissingNumber(list,100);
        assertEquals(1,missingNumber);
    }

    @Test
    void findMissingNumberEnhanceUntil100AndMissingNumber1() {
        List<Integer> list = createOrdinalList(100);
        list.remove(POSITION_1);
        int missingNumberEnhance = findMissingNumber.findMissingNumberEnhance(list);
        assertEquals(1,missingNumberEnhance);
    }

    /**
     * Create list effort 3654
     * Calculate missing number effort 206
     * Total effort 3860
     *
     * Create list effort 3626
     * Calculate missing number effort 203
     * Total effort 3829
     *
     * Create list effort 3649
     * Calculate missing number effort 202
     * Total effort 3851
     *
     * Create list effort 3752
     * Calculate missing number effort 213
     * Total effort 3965
     *
     */
    @Test
    void findMissingNumberWithListUntil100000000AndMissingNumber1() {
        long currentTimeMillis = System.currentTimeMillis();
        List<Integer> list = createOrdinalList(100000000);
        long currentTimeMillis2 = System.currentTimeMillis();
        System.out.println("Create list effort " + (currentTimeMillis2-currentTimeMillis));
        list.remove(POSITION_1);
        long currentTimeMillis3 = System.currentTimeMillis();
        int missingNumber = findMissingNumber.findMissingNumber(list,100);
        assertEquals(1,missingNumber);
        System.out.println("Calculate missing number effort " + (currentTimeMillis3-currentTimeMillis2));
        System.out.println("Total effort " + (currentTimeMillis3-currentTimeMillis));
    }

    /**
     * Create list effort 4011
     * Calculate missing number effort 251
     * Total effort 4262
     *
     * Create list effort 3970
     * Calculate missing number effort 225
     * Total effort 4195
     *
     * Create list effort 3620
     * Calculate missing number effort 219
     * Total effort 3839
     *
     * Create list effort 3850
     * Calculate missing number effort 201
     * Total effort 4051
     */

    @Test
    void findMissingNumberEnhanceUntil100000000AndMissingNumber1() {
        long currentTimeMillis = System.currentTimeMillis();
        List<Integer> list = createOrdinalList(100000000);
        long currentTimeMillis2 = System.currentTimeMillis();
        System.out.println("Create list effort " + (currentTimeMillis2-currentTimeMillis));
        list.remove(POSITION_1);
        long currentTimeMillis3 = System.currentTimeMillis();
        int missingNumberEnhance = findMissingNumber.findMissingNumberEnhance(list);
        assertEquals(1,missingNumberEnhance);
        System.out.println("Calculate missing number effort " + (currentTimeMillis3-currentTimeMillis2));
        System.out.println("Total effort " + (currentTimeMillis3-currentTimeMillis));
    }

    private List<Integer> createOrdinalList(int numberOfElements) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <= numberOfElements;i++) {
            list.add(i);
        }
        return list;
    }

    @Test
    void findMissingNumberWithConstraintsWithNumbersGraterThanLength(){
        Integer[] numbers = {50,10,1};
        int missingNumber = findMissingNumber.findMissingNumberWithConstraints(Arrays.asList(numbers));
        assertEquals(0, missingNumber);
    }

    @Test
    void findMissingNumberWithConstraintsWithNumbersSizeGraterThan104(){
        List<Integer> ordinalList = createOrdinalList(105);
        int missingNumber = findMissingNumber.findMissingNumberWithConstraints(ordinalList);
        assertEquals(0, missingNumber);
    }

    @Test
    void findMissingNumberWithConstraintsMissingNumber1(){
        Integer[] numbers = {0};
        int missingNumber = findMissingNumber.findMissingNumberWithConstraints(Arrays.asList(numbers));
        assertEquals(1, missingNumber);
    }

    @Test
    void findMissingNumberWithConstraintsMissingNumber2(){
        Integer[] numbers = {3,0,1};
        int missingNumber = findMissingNumber.findMissingNumberWithConstraints(Arrays.asList(numbers));
        assertEquals(2, missingNumber);
    }

    @Test
    void findMissingNumberWithConstraintsMissingNumber8(){
        Integer[] numbers = {9,6,4,2,3,5,7,0,1};
        int missingNumber = findMissingNumber.findMissingNumberWithConstraints(Arrays.asList(numbers));
        assertEquals(8, missingNumber);
    }

    @Test
    void findMissingNumberWithConstraintsMissingNumber3(){
        Integer[] numbers = {0,2,1};
        int missingNumber = findMissingNumber.findMissingNumberWithConstraints(Arrays.asList(numbers));
        assertEquals(3, missingNumber);
    }

    @Test
    void findMissingNumberWithConstraintsWithEmptyList(){
        Integer[] numbers = {};
        int missingNumber = findMissingNumber.findMissingNumberWithConstraints(Arrays.asList(numbers));
        assertEquals(0, missingNumber);
    }

    @Test
    void missingNumber(){

    }
}