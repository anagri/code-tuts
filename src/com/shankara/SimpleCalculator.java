package com.shankara;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleCalculator {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Insufficient arguments");
            System.out.println("Usage com.shankara.SimpleCalculator <arg1> <arg2>");
            System.out.println("Return <arg1> + <arg2>");
            return;
        }

        if (args[1].matches("\\d+e\\d+") || args[2].matches("\\d+e\\d+")) {
            Pattern expPattern = Pattern.compile("(\\d+)e(\\d+)");
            Matcher matcher = expPattern.matcher(args[1]);
            long first, second;
            if (matcher.matches()) {
                first = Long.parseLong(matcher.group(1));
                first *= Math.pow(10, Double.parseDouble(matcher.group(2)));
            } else {
                first = Long.parseLong(args[1]);
            }

            matcher = expPattern.matcher(args[2]);
            if (matcher.matches()) {
                second = Long.parseLong(matcher.group(1));
                second *= Math.pow(10, Double.parseDouble(matcher.group(2)));
            } else {
                second = Long.parseLong(args[2]);
            }
            System.out.println(first + second);
        } else if (args[1].contains(".") || args[2].contains(".")) {
            float first = Float.parseFloat(args[1]);
            float second = Float.parseFloat(args[2]);
            if (args[0].equals("+")) {
                System.out.println(first + second);
            } else {
                System.out.println(first - second);
            }
        } else {
            long first = Long.parseLong(args[1]);
            long second = Long.parseLong(args[2]);
            if (args[0].equals("+")) {
                System.out.println(first + second);
            } else {
                System.out.println(first - second);
            }
        }
    }
}
