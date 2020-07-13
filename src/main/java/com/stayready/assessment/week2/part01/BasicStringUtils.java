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
        String word;
        StringBuffer reverseaStr = new StringBuffer(string1);
        word = reverseaStr.reverse().toString();
         
        return word;
        //String reverse="The ";
        //StringBuilder word = new StringBuilder(string1);
     
    
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        //String word;
        String word1;
        String word2;
        StringBuffer reverse1 = new StringBuffer(string1);
        StringBuffer reverse2 = new StringBuffer(string2);
        
        word1 = reverse1.reverse().toString();
        word2 = reverse2.reverse().toString();
    
        return word1 + word2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String characters = charactersToRemove;
        String removeChar  = string.replaceAll(characters, ""); 

        return removeChar;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        
       // String word;
        String removeandReverse = BasicStringUtils.removeCharacters(string, charactersToRemove);
        
        
        return BasicStringUtils.reverse(removeandReverse);
    }
}
