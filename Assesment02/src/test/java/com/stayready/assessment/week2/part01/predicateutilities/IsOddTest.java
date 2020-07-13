package com.stayready.assessment.week2.part01.predicateutilities;

import com.stayready.assessment.week2.part01.PredicateUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsOddTest {
    @Test
    public void test1() {
        test(0, false);
    }

    @Test
    public void test2() {
        test(1, true);
    }

    @Test
    public void test3() {
        test(2, false);
    }

    @Test
    public void test4() {
        test(3, true);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isOdd(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
