package com.stayready.assessment.week2.part01.predicateutilities;

import com.stayready.assessment.week2.part01.PredicateUtilities;
import org.junit.Assert;
import org.junit.Test;

public class IsMultipleOfNTest {
    @Test
    public void test1() {
        test(1, 2,false);

        //Given
        int value = 1;
        int multiple = 2;
        boolean expected = false;

        //When
        boolean actual = PredicateUtilities.isMultipleOfN(value, multiple);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test(3, 3, true);

        //Given
        int value = 3;
        int multiple = 3;
        boolean expected = true;

        //When
        boolean actual = PredicateUtilities.isMultipleOfN(value, multiple);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test(7, 5, false);

        //Given
        int value = 7;
        int multiple = 5;
        boolean expected = false;

        //When
        boolean actual = PredicateUtilities.isMultipleOfN(value, multiple);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        test(8, 4, true);

        //Given
        int value = 8;
        int multiple = 4;
        boolean expected = true;

        //When
        boolean actual = PredicateUtilities.isMultipleOfN(value, multiple);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        test(12, 6, true);

        //Given
        int value = 12;
        int multiple = 6;
        boolean expected = true;

        //When
        boolean actual = PredicateUtilities.isMultipleOfN(value, multiple);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }


    private void test(Integer value, Integer multiple, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.isMultipleOfN(value, multiple);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
