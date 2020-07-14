package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        String conca="";
        return conca+=string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder sb = new StringBuilder(string1);
        
        return sb.reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder sb = new StringBuilder(string1);
        StringBuilder sb2 = new StringBuilder(string2);
        String concate="";
        concate= sb.reverse().toString()+ sb2.reverse().toString();

        return concate;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }
    public static String removeCharacters(String string, String charactersToRemove) {
//        StringBuilder sb= new StringBuilder(string);
//        String removeChar="";
//        String beforeRemove="";
//        String afterRemove="";
//        Integer toRemove=0;
//        Integer count =0;
//        toRemove=sb.indexOf(charactersToRemove);
//        removeChar= sb.
////       // while(count<=sb.length()) {
////         for (int i = 0; i <= sb.length(); i++) {
////                 toRemove = sb.indexOf(charactersToRemove);
////                 beforeRemove = sb.substring(0, toRemove);
////                 afterRemove = sb.substring(toRemove + 1,sb.length()-1);
////            //count++;
////        }
//
//

        //return afterRemove;
        return null;

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
