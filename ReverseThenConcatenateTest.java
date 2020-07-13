package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReverseThenConcatenateTest {
    @Test
    public void test1() {
        test("The", "Quick", "ehTkciuQ");

        //Given
        String string1 = "The";
        String string2 = "Quick";
        String expected = "ehTkciuQ";

        //When
        String actual = BasicStringUtils.reverseThenConcatenate(string1, string2);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test("Brown", "Fox", "nworBxoF");

        //Given
        String string1 = "Brown";
        String string2 = "Fox";
        String expected = "nworBxoF";

        //When
        String actual = BasicStringUtils.reverseThenConcatenate(string1, string2);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test("Jumps", "Over", "spmuJrevO");

        //Given
        String string1 = "Jumps";
        String string2 = "Over";
        String expected = "spmuJrevO";

        //When
        String actual = BasicStringUtils.reverseThenConcatenate(string1, string2);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }


    private void test(String string1, String string2, String expectedString) {
        // when
        String actualString = BasicStringUtils.reverseThenConcatenate(string1, string2);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
