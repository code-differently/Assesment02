package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveCharactersTest {
    @Test
    public void test1() {
        test("racecar", "r", "aceca");

        //Given
        String string = "racecar";
        String charactersToRemove = "r";
        String expected = "aceca";

        //When
        String actual = BasicStringUtils.removeCharacters(string, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test("basketball", "b", "asketall");

        //Given
        String string = "basketball";
        String charactersToRemove = "b";
        String expected = "asketall";

        //When
        String actual = BasicStringUtils.removeCharacters(string, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test("basketball", "teks", "baball");

        //Given
        String string = "basketball";
        String charactersToRemove = "teks";
        String expected = "baball";

        //When
        String actual = BasicStringUtils.removeCharacters(string, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        test("football", "fto", "ball");

        //Given
        String string = "football";
        String charactersToRemove = "fto";
        String expected = "ball";

        //When
        String actual = BasicStringUtils.removeCharacters(string, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    private void test(String string, String charactersToRemove, String expectedString) {
        // when
        String actualString = BasicStringUtils.removeCharacters(string, charactersToRemove);


        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
