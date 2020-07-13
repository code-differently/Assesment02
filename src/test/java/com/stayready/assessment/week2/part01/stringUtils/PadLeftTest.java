package com.stayready.assessment.week2.part01.stringUtils;

import com.stayready.assessment.week2.part01.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class PadLeftTest {
    @Test
    public void padLeft10Test() {
        // Given
        String hello = "hello";
        int numberOfUnitsToPad = 10;
        String expected = "     hello";
        //String expected2 = "     hello";

        // When
        String actual = StringUtils.padLeft(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void padLeft15Test() {
        // Given
        String hello = "";
        int numberOfUnitsToPad = 15;
        String expected = "               ";
        String expected2 = "               ";

        // When
        String actual = StringUtils.padLeft(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expected, expected2);
    }


    @Test
    public void padLeft20Test() {
        // Given
        String hello = "The quick";
        int numberOfUnitsToPad = 20;
        String expected = "           The quick";

        // When
        String actual = StringUtils.padLeft(hello, numberOfUnitsToPad);

        // Then
        Assert.assertEquals(expected, actual);
    }
}
