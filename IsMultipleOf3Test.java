package com.stayready.assessment.week2.part01.predicateutilities;

import com.stayready.assessment.week2.part01.PredicateUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsMultipleOf3Test {
    @Test
    public void test1() {
        test(1, false);

        //Given
        int value = 1;
        Boolean expected = false;

        //When
        Boolean actual = PredicateUtilities.isMultipleOf3(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test(3, true);

        //Given
        int value = 3;
        Boolean expected = true;

        //When
        Boolean actual = PredicateUtilities.isMultipleOf3(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test(7, false);

        //Given
        int value = 7;
        Boolean expected = false;

        //When
        Boolean actual = PredicateUtilities.isMultipleOf3(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        test(6, true);

        //Given
        int value = 6;
        Boolean expected = true;

        //When
        Boolean actual = PredicateUtilities.isMultipleOf3(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        test(9, true);

        //Given
        int value = 9;
        Boolean expected = true;

        //When
        Boolean actual = PredicateUtilities.isMultipleOf3(value);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }


    private void test(Integer value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isMultipleOf3(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
