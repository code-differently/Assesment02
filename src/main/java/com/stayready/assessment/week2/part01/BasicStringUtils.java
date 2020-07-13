package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {

        return string1 + string2;

        //OR

        string1 = "";
        string2 = "";
        String string3 = string1.concat(string2);
        return string3;
        //OR

        String s =(new StringBuilder()).append(string1).append(string2).toString();
        return s;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String string = "";
        for(int i = 0; i < string1.length(); i++){
            String t = string1.charAt(string1.length()-1 - i);
        }
        return string;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reverse = BasicStringUtils.reverse(string1);
        String thenConcat = BasicStringUtils.concatenate(reverse);
        return thenConcat;

        //OR

        }

    

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    //CONFUSED
    public static String removeCharacters(String string, String charactersToRemove) {
       for (int i = 0; i < string.length(); i++)
       {
           if (string[i].equals(charactersToRemove))
           {
               string[i] = null;
           }
       }
       
       //OR
       
        String str = charactersToRemove;
        String str = string.substring(string.length[]);
        return string;
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
