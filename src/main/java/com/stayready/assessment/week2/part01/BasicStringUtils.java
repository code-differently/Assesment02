package com.stayready.assessment.week2.part01;

import java.lang.*;
import java.io.*;
import java.util.*;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder reversed = new StringBuilder();

        reversed.append(string1);
        reversed = reversed.reverse();
        String value = reversed.toString();
        return value;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String value1 = BasicStringUtils.reverse(string1);
        String value2 = BasicStringUtils.reverse(string2);
        return value1 + value2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String newStr = string.replace(charactersToRemove, "");
        return newStr;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String newStr = BasicStringUtils.removeCharacters(string,charactersToRemove);
        newStr = BasicStringUtils.reverse(newStr);
        return null;
    }
}
