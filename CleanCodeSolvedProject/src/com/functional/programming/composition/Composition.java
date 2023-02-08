package com.functional.programming.composition;

import com.functional.programming.streams.project.Company;
import com.functional.programming.streams.project.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Composition {
    public static void main(String[] args) {
        simpleComposition();
        moreAdvanceComposition();
    }

    private static void moreAdvanceComposition() {
        List<Employee> employeeList = new Company().getEmployees();

        Function<Employee, String> getName = employee -> employee.getName();
        Function<String, String> reverse = str -> new StringBuilder(str).reverse().toString();
        Function<String, String> upperCase = str -> str.toUpperCase();

        Function<Employee, String> getReverseUpperCaseName = getName.andThen(reverse).andThen(upperCase);

        String result = employeeList.stream().map(getReverseUpperCaseName).collect(Collectors.joining(", "));
        System.out.println(result);
    }

    /**
     * The compose method apply in reverse order, firs execute timesTwo and then
     * execute minusOne.
     * But to be more clear there is an option using andThen method which allows to execute the functions in the
     * same order as we declare.
     * */
    private static void simpleComposition() {
        Function<Integer, Integer> timesTwo = x -> x * 2;
        Function<Integer, Integer> minusOne = x -> x-1;
        Function<Integer, Integer> timesTwoMinusOne = minusOne.compose(timesTwo);
        Function<Integer, Integer> timesTwoMinusOne2 = timesTwo.andThen(minusOne);
        Function<Integer, Integer> minusOneTimesTwo = timesTwo.compose(minusOne);
        System.out.println(timesTwoMinusOne.apply(10));
        System.out.println(timesTwoMinusOne2.apply(10));
        System.out.println(minusOneTimesTwo.apply(10));
    }
}
