package com.shankara;

public class Calculator {
    public static void main(String[] args) {
        float firstTerm = Float.parseFloat(args[0]);
        boolean add = Boolean.parseBoolean(args[args.length - 1]);
        for (int i = 1; i < args.length - 1; i++) {
            float secondTerm = Float.parseFloat(args[i]);
            if (add)
                firstTerm += secondTerm;
            else
                firstTerm -= secondTerm;
        }
        System.out.println(firstTerm);
    }
}
