package com.shankara.bill;

import com.shankara.Calculator2;

public class Bill {
    public static void main(String[] args) {
        int[] ints = {10, 2, 3, 4};
        int result = new Calculator2().compute(ints);
        System.out.println(result);
    }
}
