package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveCharactersThenReverseTest {
    @Test
    public void test1() {
        test("Feelers", "er", "slF");

        //Given
        String stringToManipulate = "Feelers";
        String charactersToRemove = "er";
        String expected = "slF";

        //When
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        test("Takers", "ers", "kaT");

        //Given
        String stringToManipulate = "Takers";
        String charactersToRemove = "ers";
        String expected = "kaT";

        //When
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test3() {
        test("Takers", "res", "kaT");

        //Given
        String stringToManipulate = "Takers";
        String charactersToRemove = "res";
        String expected = "kaT";

        //When
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        test("breaking", "kaer", "gnib");

        //Given
        String stringToManipulate = "breaking";
        String charactersToRemove = "kaer";
        String expected = "gnib";

        //When
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);
        System.out.println(actual);

        //Then
        Assert.assertEquals(expected, actual);
    }

    private void test(String stringToManipulate, String charactersToRemove, String expected) {
        // when
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }
}
