package com.stayready.assessment.week2.part02;

import org.junit.Assert;
import org.junit.Test;

public class IntegerArrayUtilsTest {
    @Test
    public void testAdd1() {
        // given
        Integer valueToBeAdded = 10;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, valueToBeAdded};

        // when
        Integer[] actual = IntegerArrayUtils.add(intArray, valueToBeAdded);
        System.out.println(actual);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testAdd2() {
        // given
        Integer firstValueToBeAdded = 10;
        Integer secondValueToBeAdded = 17;
        Integer[] intArray = {1, 3, 2, 5, 4, 7, 6};
        Integer[] expected = {1, 3, 2, 5, 4, 7, 6, firstValueToBeAdded, secondValueToBeAdded};

        // when
        Integer[] actual = IntegerArrayUtils.add(intArray, firstValueToBeAdded);
        actual = IntegerArrayUtils.add(actual, secondValueToBeAdded);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void firstTest() {
        // given
        Integer[] input =    {2,4,6,11,13,15};
        Integer[] expected = {2,4,6,10,12,14};

        // when
        Integer[] actual = IntegerArrayUtils.decrementOdd(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void secondTest() {
        // given
        Integer[] input =    {10,20,30,1,3,5};
        Integer[] expected = {10,20,30,0,2,4};;

        // when
        Integer[] actual = IntegerArrayUtils.decrementOdd(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testGet1() {
        // Given
        Integer indexToFetch = 3;
        Integer[] input = {1,2,5,178931798};
        Integer expected = 178931798;

        // when
        Integer actual = IntegerArrayUtils.get(input, indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGet2() {
        // Given
        Integer indexToFetch = 0;
        Integer[] input = {981238912,2,5,8};
        Integer expected = 981238912;

        // when
        Integer actual = IntegerArrayUtils.get(input, indexToFetch);

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testOneEvenElement() {
        //for one even element
        Integer[] input3 = {38};
        Integer[] expectedOutput3 = {39};

        Integer[] actual3 = IntegerArrayUtils.incrementEvenDecrementOdd(input3);

        Assert.assertArrayEquals(expectedOutput3, actual3);
    }

    @Test
    public void testOneOddElement() {
        //for one odd element
        Integer[] input4 = {91};
        Integer[] expectedOutput4 = {90};

        Integer[] actual4 = IntegerArrayUtils.incrementEvenDecrementOdd(input4);

        Assert.assertArrayEquals(expectedOutput4, actual4);
    }


    @Test
    public void testOdd() {
        //for odd numbers
        Integer[] input1 = {101, 25, 11};
        Integer[] expectedOutput1 = {100, 24, 10};

        Integer[] actual1 = IntegerArrayUtils.incrementEvenDecrementOdd(input1);

        Assert.assertArrayEquals(expectedOutput1, actual1);
    }

    @Test
    public void testEven() {
        //for even numbers
        Integer[] input2 = {34, 18, 700, 128, 110};
        Integer[] expectedOutput2 = {35, 19, 701, 129, 111};

        Integer[] actual2 = IntegerArrayUtils.incrementEvenDecrementOdd(input2);

        Assert.assertArrayEquals(expectedOutput2, actual2);
    }

    @Test
    public void test1() {
        // given
        Integer[] input =    {1,2,3,4,5,6,7,8};
        Integer[] expected = {1,3,3,5,5,7,7,9};


        // when
        Integer[] actual = IntegerArrayUtils.incrementEven(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        // given
        Integer[] input =    {10,20,30,1,3,5};
        Integer[] expected = {11,21,31,1,3,5};

        // when
        Integer[] actual = IntegerArrayUtils.incrementEven(input);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsert1() {
        // Given
        Integer indexToInsertAt = 3;
        Integer valueToBeInserted = 12;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {1,2,5,valueToBeInserted};

        // when
        Integer[] actual = IntegerArrayUtils.replace(input, indexToInsertAt, valueToBeInserted);

        // then
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testInsert2() {
        // Given
        Integer valueToBeInserted = 82;
        Integer indexToInsertAt = 0;
        Integer[] input = {1,2,5,8};
        Integer[] expected = {valueToBeInserted,2,5,8};

        // when
        Integer[] actual = IntegerArrayUtils.replace(input, indexToInsertAt, valueToBeInserted);

        // then
        Assert.assertArrayEquals(expected, actual);
    }
}
