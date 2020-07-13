package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        int actualAmount = amountOfPadding - stringToBePadded.length();
        String padding = " ".repeat(actualAmount);
        return padding + stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        int actualAmount = amountOfPadding - stringToBePadded.length();
        String padding = " ".repeat(actualAmount);
        return stringToBePadded + padding;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        return stringToBeRepeated.repeat(numberOfTimeToRepeat);
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        boolean result = true;
        string = BasicStringUtils.removeCharacters(string, " ");
        //start by removing spaces, they cause test to fail, doesn't sig impact string
        char[] chrArray = string.toCharArray();
        for(char c: chrArray){
            if(Character.isLetter(c) == false){
                result = false;
            }
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean result = true;
        string = BasicStringUtils.removeCharacters(string, " ");
        //start by removing spaces, they cause test to fail, doesn't sig impact string
        char[] chrArray = string.toCharArray();
        for(char c: chrArray){
            if(Character.isDigit(c) == false){
                result = false;
            }
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        boolean result = true;
        string = BasicStringUtils.removeCharacters(string, " ");
        //start by removing spaces, they cause test to fail, doesn't sig impact string
        char[] chrArray = string.toCharArray();
        for(char c: chrArray){
            if(Character.isLetterOrDigit(c) == true){
                result = false;
            }
        }
        return result;
    }
}
