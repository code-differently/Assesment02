package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String str = string1;
        for(int i = 0; i < string2.length(); i++){
            str += string2.charAt(i);
        }
        return str;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String newStr = "";
		for (int i = string1.length() - 1; i >= 0; i--) {
			newStr += string1.charAt(i);
		}
		return newStr;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String str1 = reverse(string1);
        String str2 = reverse(string2);
        return concatentate(str1, str2);
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String str = string;
        String newStr = "";
        boolean isFound = false;
        for(int i = 0; i < str.length(); i++){
           for(int j = 0; j < charactersToRemove.length(); j++){
               if((str.charAt(i) == charactersToRemove.charAt(j)) && isFound == false){
                    isFound = true;
               }
           }
           if(!isFound){
            newStr += str.charAt(i);
           }
           else{
               isFound = false;
           }
        }
        return newStr;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String newStr = removeCharacters(string, charactersToRemove);
        return reverse(newStr);
    }
}
