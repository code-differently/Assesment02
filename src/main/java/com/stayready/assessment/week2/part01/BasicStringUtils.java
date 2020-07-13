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

        char[] letters= string1.toCharArray();
        int len = letters.length-1;
        for(int i = 0; i < letters.length/2; i++){
            char temp = letters[i];
            letters[i] = letters[len];
            letters[len] = temp;
            len--;
        }

        return new String(letters);
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        return concatentate(reverse(string1), reverse(string2));
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        char[] letters = charactersToRemove.toCharArray();
        for(int i = 0; i < letters.length;i++){
            string=string.replaceAll(Character.toString(letters[i]),"");
        }
        return string;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        return reverse(removeCharacters(string, charactersToRemove));
    }
}
