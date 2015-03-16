package com.shankara.day2;

import java.util.Arrays;

public class NumberFilterApp {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        NumberFilter numberFilter = new NumberFilter(numbers);
        System.out.println(Arrays.toString(numberFilter.even())); // prints 2, 4, 6, 8, 10
        System.out.println(Arrays.toString(numberFilter.odd())); // prints 1, 3, 5, 7, 9
        System.out.println(numberFilter.sum()); // prints 55
        System.out.println(numberFilter.mult()); // prints 3628800

        System.out.println("Lambda inbuilt functions");
        System.out.println(Arrays.toString(Arrays.stream(numbers).filter(integer -> integer % 2 == 0).toArray()));
        System.out.println(Arrays.toString(Arrays.stream(numbers).filter(integer -> integer % 2 == 1).toArray()));
        System.out.println(Arrays.stream(numbers).reduce(0, (integer, integer2) -> integer + integer2));
        System.out.println(Arrays.stream(numbers).reduce(1, (integer, integer2) -> integer * integer2));
    }
}
