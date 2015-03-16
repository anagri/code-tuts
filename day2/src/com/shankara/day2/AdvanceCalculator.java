package com.shankara.day2;

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

    public String total(String[] vals) {
        return null;
        //TODO - implement
    }
}
