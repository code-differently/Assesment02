package com.stayready.assessment.week2.part01;

import java.util.ArrayList;

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
        char[] strArray = string1.toCharArray();
        String result = "";
        for(int i = strArray.length-1; i>=0; i--){
            result += strArray[i];
        }
        return result;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        string1 = BasicStringUtils.reverse(string1);
        string2 = BasicStringUtils.reverse(string2);
        return BasicStringUtils.concatentate(string1, string2);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String regx = "[" + charactersToRemove + "]";
        return string.replaceAll(regx, "");
        //definitely need to go over why [teks] works when passed in and not "teks"
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String result = BasicStringUtils.removeCharacters(string, charactersToRemove);
        return BasicStringUtils.reverse(result);
    }
}
