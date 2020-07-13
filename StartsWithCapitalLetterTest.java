package com.stayready.assessment.week2.part01.predicateutilities;

import com.stayready.assessment.week2.part01.PredicateUtilities;
import org.junit.Assert;
import org.junit.Test;

public class StartsWithCapitalLetterTest {
    @Test
    public void test1() {
        test("The", true);

        //Given
        String string = "The";
        boolean expected = true;

        //When
        boolean actual = PredicateUtilities.startsWithCapitalLetter(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test("quick", false);

        //Given
        String string = "quick";
        boolean expected = false;

        //When
        boolean actual = PredicateUtilities.startsWithCapitalLetter(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test("%^&*", false);

        //Given
        String string = "%^&*";
        boolean expected = false;

        //When
        boolean actual = PredicateUtilities.startsWithCapitalLetter(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        test("fox", false);

        //Given
        String string = "fox";
        boolean expected = false;

        //When
        boolean actual = PredicateUtilities.startsWithCapitalLetter(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        test("Jumps", true);

        //Given
        String string = "Jumps";
        boolean expected = true;

        //When
        boolean actual = PredicateUtilities.startsWithCapitalLetter(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }


    private void test(String value, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = PredicateUtilities.startsWithCapitalLetter(value);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
