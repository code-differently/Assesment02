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
        String reverseString = " ";
        for(int i = string1.length()-1; i >= 0; i--){
            reverseString += string1.charAt(i);


        }
        return reverseString.trim();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reverseString = " ";
        String reverseString2 = " ";
        for(int i = string1.length()-1; i >= 0; i--){
            reverseString += string1.charAt(i);
        }
        for(int j = string2.length()-1; j >= 0; j--){
            reverseString2 += string2.charAt(j);
        }

        return reverseString.trim() + reverseString2.trim();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        StringBuilder result = new StringBuilder();
        for (char character : string.toCharArray()) {
            if (charactersToRemove.indexOf(character) == -1) {
                result.append(character);
            }
        }
        return result.toString();

    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {

        StringBuilder stringBuilder = new StringBuilder();
        for (char character : string.toCharArray()) {
            if (charactersToRemove.indexOf(character) == -1) {
                stringBuilder.append(character);
            }

        }
        String sb = new String();
        for(int i = stringBuilder.length()-1; i >= 0; i--){
            sb += stringBuilder.charAt(i);
        }
        return sb;

    }
}
