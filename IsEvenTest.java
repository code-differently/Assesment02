package com.stayready.assessment.week2.part01.predicateutilities;

import com.stayready.assessment.week2.part01.PredicateUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsEvenTest {
    @Test
    public void test1() {
        test(0, true);

        //Given
        int value = 0;
        boolean expected = true;

        //When
        Boolean actual = PredicateUtilities.isEven(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void test2() {
        test(1, false);


        //Given
        int value = 1;
        boolean expected = false;

        //When
        Boolean actual = PredicateUtilities.isEven(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void test3() {
        test(2, true);


        //Given
        int value = 2;
        boolean expected = true;

        //When
        Boolean actual = PredicateUtilities.isEven(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals (expected, actual);
    }

    @Test
    public void test4() {
        test(3, false);


        //Given
        int value = 3;
        boolean expected = false;

        //When
        Boolean actual = PredicateUtilities.isEven(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals (expected, actual);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isEven(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
