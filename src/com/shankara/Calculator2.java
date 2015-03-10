package com.shankara;

public class Calculator2 {

    public static void main(String[] args) {
        int[] vals = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            vals[i] = Integer.parseInt(args[i]);
        }
        int result = new Calculator2().compute(vals);
        System.out.println(result);
    }

    public int compute(int[] vals) {
        int result = 0;
        for (int val : vals) {
            result += val;
        }
        return result;
    }
}
