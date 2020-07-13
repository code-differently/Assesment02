package com.stayready.assessment.week2.part01;

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
        StringBuilder rev = new StringBuilder(string1);
        rev.reverse();
        return rev.toString();

    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder rev1 = new StringBuilder(string1);
        StringBuilder rev2 = new StringBuilder(string2);
        rev1.reverse();
        rev2.reverse();
        return rev1.toString() + rev2.toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String str = string;
        //String revString = str.replaceAll(charactersToRemove,"");
        //return revString;
        char [] strCh = charactersToRemove.toCharArray();
        for(int i = 0; i < strCh.length; i++) {
            Character charS = strCh[i];
            String removeStr = charS.toString();

            str = str.replaceAll(removeStr,"");
        }
        return str;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        //String str = string;
        String str = removeCharacters(string, charactersToRemove);
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return rev.toString();
    }
}
