package com.stayready.assessment.week2.part01.bassicStrings;

import com.stayready.assessment.week2.part01.BasicStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RemoveCharactersThenReverseTest {
    @Test
    public void test1() {
        test("Feelers", "er", "slF");
    }

    @Test
    public void test2() {
        test("Takers", "ers", "kaT");
    }

    @Test
    public void test3() {
        test("Takers", "res", "kaT");
    }

    @Test
    public void test4() {
        test("breaking", "kaer", "gnib");
    }

    private void test(String stringToManipulate, String charactersToRemove, String expected) {
        // when
        String actual = BasicStringUtils.removeCharactersThenReverse(stringToManipulate, charactersToRemove);

        // then
        Assert.assertEquals(expected, actual);
    }
}
