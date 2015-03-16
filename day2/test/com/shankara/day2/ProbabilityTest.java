package com.shankara.day2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProbabilityTest {
    @Test
    public void testProbabilityOfNotHeads() throws Exception {
        Probability heads = new Probability(.5);
        assertEquals(new Probability(.5), heads.not());
    }

    @Test
    public void testProbabilityOfTwoHeads() throws Exception {
        Probability heads = new Probability(.5);
        assertEquals(new Probability(.25), heads.and(heads));
    }

    @Test
    public void testProbabilityOfHeadAndTailIn2Throws() throws Exception {
        Probability heads = new Probability(.5);
        Probability tails = new Probability(.5);
        Probability result = heads.and(tails).or(tails.and(heads));
        assertEquals(new Probability(.5), result);
    }
}