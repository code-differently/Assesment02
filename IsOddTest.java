package com.stayready.assessment.week2.part01.predicateutilities;

import com.stayready.assessment.week2.part01.PredicateUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsOddTest {
    @Test
    public void test1() {
        test(0, false);

        //Given
        int value = 0;
        boolean expected = false;

        //When
        Boolean actual = PredicateUtilities.isOdd(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void test2() {
        test(1, true);

        //Given
        int value = 1;
        boolean expected = true;

        //When
        Boolean actual = PredicateUtilities.isOdd(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test(2, false);

        //Given
        int value = 2;
        boolean expected = false;

        //When
        Boolean actual = PredicateUtilities.isOdd(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        test(3, true);

        //Given
        int value = 3;
        boolean expected = true;

        //When
        Boolean actual = PredicateUtilities.isOdd(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isOdd(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
