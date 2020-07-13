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
        StringBuilder sb = new StringBuilder(string1);
        String reversed = sb.reverse() + "";
        return reversed;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reversed = reverse(string1) + reverse(string2);
        return reversed;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
//        ArrayList<Character> chars = new ArrayList<>();
//        ArrayList<Character> bad_chars = new ArrayList<>();
//        ArrayList<Character> new_word = new ArrayList<>();
//        String wanted_word = "";
//
//        for (int index = 0; index < string.length(); index++)
//        {
//            chars.add(string.charAt(index));
//        }
//
//        for (int index = 0; index < charactersToRemove.length(); index++)
//        {
//            bad_chars.add(string.charAt(index));
//        }
//
//        for (int outer = 0; outer < bad_chars.size(); outer++)
//        {
//            for (int inner = 0; inner < chars.size(); inner++)
//            {
//                if (bad_chars.get(outer) != chars.get(inner))
//                {
//                    new_word.add(chars.get(inner));
//                }
//            }
//        }
//
//        for (int index = 0; index < new_word.size(); index++)
//        {
//            wanted_word = wanted_word + new_word.get(index);
//        }
//
//        return wanted_word;

        //ArrayList<Character> bad_chars = new ArrayList<>();


        for (int index = 0; index < charactersToRemove.length(); index++)
        {
            String unwanted = charactersToRemove.charAt(index) + "";
            string = string.replaceAll(unwanted, "");
        }

        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        String unreversed = removeCharacters(string, charactersToRemove);

        return reverse(unreversed);
    }

}
