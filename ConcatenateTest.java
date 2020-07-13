package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ConcatenateTest {
    @Test
    public void test1() {
        test("The", "Quick", "TheQuick");

        //Given
        String string1 = "The";
        String string2 = "Quick";
        String expected = "TheQuick";


        //When
        String actual = BasicStringUtils.concatentate(string1, string2);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test("Brown", "Fox", "BrownFox");

        //Given
        String string1 = "Brown";
        String string2 = "Fox";
        String expected = "BrownFox";

        //When
        String actual = BasicStringUtils.concatentate(string1, string2);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test("Jumps", "Over", "JumpsOver");

        //Given
        String string1 = "Jumps";
        String string2 = "Over";
        String expected = "JumpsOver";

        //When
        String actual = BasicStringUtils.concatentate(string1, string2);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    private void test(String string1, String string2, String expectedString) {
        // when
        String actualString = BasicStringUtils.concatentate(string1, string2);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
