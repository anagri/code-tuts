package com.shankara.day2;

import org.junit.Test;

public class ProbabilityTest {
    @Test
    public void testProbabilityOfNotHeads() throws Exception {
        Probability heads = new Probability(.5);
// test probability of not heads is .5
    }

    @Test
    public void testProbabilityOfTwoHeads() throws Exception {
        Probability heads = new Probability(.5);
//  2 heads in a row is .25
    }

    @Test
    public void testProbabilityOfHeadAndTailIn2Throws() throws Exception {
        Probability heads = new Probability(.5);
        Probability tails = new Probability(.5);
//   probability of Head and Tail, or Tail and Head resp in 2 throws
    }
}