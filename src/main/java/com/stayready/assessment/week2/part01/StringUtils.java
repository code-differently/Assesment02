package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String str = "";
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            str += " ";
        }
        str += stringToBePadded;
        return str;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String str = stringToBePadded;
        for(int i = 0; i < amountOfPadding - stringToBePadded.length(); i++){
            str += " ";
        }
        return str;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String str = "";
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            str += stringToBeRepeated;
        }
        return str;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        if(string.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$")){
            return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if(string.matches("^[0-9]*$")){
            return true;
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        if(string.matches("^[!&*(]*$")){
            return true;
        }
        return false;
    }
}
