package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class ReverseTest {
    @Test
    public void test1() {
        test("The", "ehT");
    }

    @Test
    public void test2() {
        test("Quick", "kciuQ");
    }

    @Test
    public void test3() {
        test("Brown", "nworB");
    }

    @Test
    public void test4() {
        test("Fox", "xoF");
    }

    private void test(String string, String expectedString) {
        // when
        String actualString = BasicStringUtils.reverse(string);

        // then
        Assert.assertEquals(expectedString, actualString);
    }
}

