package com.stayready.assessment.week2.part01.stringUtils;

import com.stayready.assessment.week2.part01.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RepeatStringTest {
    @Test
    public void testRepeatHello5Times() {
        // given
        String stringToRepeat = "Hello";
        Integer numberOfTimesToRepeat = 5;
        String expected = new StringBuilder()
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .toString();

        // when
        String actual = StringUtils.repeatString(stringToRepeat, numberOfTimesToRepeat);
        System.out.println(actual);

        // then
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testRepeatQuickBrown6Times() {
        // given
        String stringToRepeat = "Quick Brown";
        Integer numberOfTimesToRepeat = 6;
        String expected = new StringBuilder()
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .append(stringToRepeat)
                .toString();

        // when
        String actual = StringUtils.repeatString(stringToRepeat, numberOfTimesToRepeat);
        System.out.println(actual);

        // then
        Assert.assertEquals(expected, actual);
    }
}
