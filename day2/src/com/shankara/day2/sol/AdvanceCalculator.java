package com.shankara.day2.sol;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdvanceCalculator {

    public static void main(String[] args) {
        AdvanceCalculator advanceCalculator = new AdvanceCalculator();

        // Q1
        String shouldBe3 = advanceCalculator.total(new String[]{"+", "1", "2"});
        if ("3".equals(shouldBe3)) {
            System.out.println("Q1. Correct, answer=" + shouldBe3);
        } else {
            System.out.println("Q1. Incorrect, answer=" + shouldBe3);
            System.exit(-1);
        }

        String shouldBe3_3 = advanceCalculator.total(new String[]{"+", "1.1", "2.2"});
        if ("3.3".equals(shouldBe3_3)) {
            System.out.println("Q2. Correct, answer=" + shouldBe3_3);
        } else {
            System.out.println("Q2. Incorrect answer=" + shouldBe3_3);
            System.exit(-1);
        }

        String shouldBe300 = advanceCalculator.total(new String[]{"+", "1e2", "2e2"});
        if ("300".equals(shouldBe300)) {
            System.out.println("Q3. Correct, answer=" + shouldBe300);
        } else {
            System.out.println("Q3. Incorrect, answer=" + shouldBe300);
            System.exit(-1);
        }

        System.out.println("All answers are correct");
    }

    private String total(String[] vals) {
        String val1 = vals[1];
        String val2 = vals[2];
        if (val1.matches("\\d+") && val2.matches("\\d+")) {
            int v1 = Integer.parseInt(val1);
            int v2 = Integer.parseInt(val2);
            int sum = v1 + v2;
            return Integer.toString(sum);
        }

        if (val1.matches("[\\d\\.]+") && val2.matches("[\\d\\.]+")) {
            float v1 = Float.parseFloat(val1);
            float v2 = Float.parseFloat(val2);
            float sum = v1 + v2;
            return String.format("%.1f", sum);
        }

        if (val1.matches("\\d+e\\d+") && val2.matches("\\d+e\\d+")) {
            int v1 = parseValue(val1);
            int v2 = parseValue(val2);
            int sum = v1 + v2;
            return Integer.toString(sum);
        }

        return null;
    }

    private int parseValue(String val) {
        Pattern pattern = Pattern.compile("(\\d+)e(\\d+)");
        Matcher matcher = pattern.matcher(val);
        matcher.find();
        int digit = Integer.parseInt(matcher.group(1));
        int raisedTo = Integer.parseInt(matcher.group(2));
        return (int) (digit * Math.pow(10, raisedTo));
    }
}
