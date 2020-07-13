package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
    @Test
    public void test1() {
        test("The", "ehT");

        //Given
        String string = "The";
        String expected = "ehT";

        //When
        String actual = BasicStringUtils.reverse(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test("Quick", "kciuQ");

        //Given
        String string = "Quick";
        String expected = "kciuQ";

        //When
        String actual = BasicStringUtils.reverse(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test("Brown", "nworB");

        //Given
        String string = "Brown";
        String expected = "nworB";

        //When
        String actual = BasicStringUtils.reverse(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        test("Fox", "xoF");

        //Given
        String string = "Fox";
        String expected = "xoF";

        //When
        String actual = BasicStringUtils.reverse(string);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    private void test(String string, String expectedString) {
        // when
        String actualString = BasicStringUtils.reverse(string);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}

