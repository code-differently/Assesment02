package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatenate(String string1, String string2) {
        String a = "The";
        String b = "Quick";
        String input = a + b;
        return input;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder reverseString = new StringBuilder();
        String[] words = string1.split(" ");
        for(String word : words){
            String reverseWord = new StringBuilder(word).reverse().toString();
            reverseString.append(reverseWord + " ");
        }
        return reverseString.toString().trim();
    }
    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reverse1 = BasicStringUtils.reverse(string1);
        String reverse2 = BasicStringUtils.reverse(string2);
        String concat = reverse1 + reverse2;

        return concat;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String remove = "racecar";
        String removeNew = remove.replace("r", "");

        return removeNew;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        return null;
    }
}
