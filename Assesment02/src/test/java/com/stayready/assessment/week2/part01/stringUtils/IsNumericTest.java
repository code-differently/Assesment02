package com.stayready.assessment.week2.part01.stringUtils;

import com.stayready.assessment.week2.part01.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class IsNumericTest {
    @Test
    public void alphaStringTest1() {
        // Given
        String alphaString = "The quick brown fox jumps";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }

    @Test
    public void alphaStringTest2() {
        // Given
        String alphaString = "Over the lazy dog";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest1() {
        // Given
        String alphaString = "1234";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void numericStringTest2() {
        // Given
        String alphaString = "Over the lazy dog1";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest1() {
        // Given
        String alphaString = "!&*(";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest2() {
        // Given
        String alphaString = "Over the lazy dog!";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }
}
