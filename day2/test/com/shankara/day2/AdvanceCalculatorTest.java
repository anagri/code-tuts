package com.shankara.day2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdvanceCalculatorTest {

    private AdvanceCalculator advanceCalculator;

    @Before
    public void setUp() throws Exception {
        advanceCalculator = new AdvanceCalculator();
    }

    @Test
    public void testForInts() throws Exception {
        String result = advanceCalculator.total(new String[]{"+", "1", "2"});
        assertEquals("3", result);
    }

    @Test
    public void testForFloats() throws Exception {
        String result = advanceCalculator.total(new String[]{"1.1", "2.2"});
        assertEquals("3.3", result);
    }

    @Test
    public void testForExponentials() throws Exception {
        String result = advanceCalculator.total(new String[]{"1e2", "2e2"});
        assertEquals("300", result);
    }
}