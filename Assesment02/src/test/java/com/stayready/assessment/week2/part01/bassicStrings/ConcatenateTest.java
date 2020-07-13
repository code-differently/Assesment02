package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ConcatenateTest {
    @Test
    public void test1() {
        test("The", "Quick", "TheQuick");
    }

    @Test
    public void test2() {
        test("Brown", "Fox", "BrownFox");
    }

    @Test
    public void test3() {
        test("Jumps", "Over", "JumpsOver");
    }

    private void test(String string1, String string2, String expectedString) {
        // when
        String actualString = BasicStringUtils.concatentate(string1, string2);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}
