package com.shankara.day2;

import java.util.ArrayList;

public class NumberFilter {

    private final Integer[] numbers;

    public NumberFilter(Integer[] numbers) {
        this.numbers = numbers;
    }

    public Integer[] even() {
        return filter(i -> i % 2 == 0);
    }

    public Integer[] odd() {
        return filter(i -> i % 2 == 1);
    }

    public Integer sum() {
        return reduce(0, (i, j) -> i + j);
    }

    public Integer mult() {
        return reduce(1, (i, j) -> i * j);
    }

    private Integer reduce(int init, Inject inject) {
        int result = init;
        for (Integer number : numbers) {
            result = inject.inject(result, number);
        }
        return result;
    }

    private Integer[] filter(Predicate predicate) {
        ArrayList<Integer> evens = new ArrayList<>();
        for (Integer number : numbers) {
            if (predicate.evaluate(number)) evens.add(number);
        }
        Integer[] result = new Integer[evens.size()];
        evens.toArray(result);
        return result;
    }

    private static interface Predicate {
        public boolean evaluate(int i);
    }

    private static interface Inject {
        public int inject(int i, int j);
    }
}
