package com.functional.programming.reccursion;

public class Recursion {
    static void countDown(Integer count) {
        if (count < 0){
            System.out.println("Done!");
            return;
        }
        System.out.println(count);
        countDown(count -1);
    }
    public static void main(String[] args) {
        countDown(10);
    }
}
