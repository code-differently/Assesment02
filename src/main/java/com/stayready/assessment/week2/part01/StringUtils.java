package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < amountOfPadding; i++) {
            builder.append(' ');
        }
        String newString = builder.substring(stringToBePadded.length())+stringToBePadded;
        return newString;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-"+ amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder builder = new StringBuilder();
        for(int i =0; i<numberOfTimeToRepeat;i++) {
            builder.append(stringToBeRepeated);
        }
        return builder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        //return string != null && string.matches("[^a-sA-Z]*$");
        //}
       // return null;
        if(string == null || string.length() == 0){
            return false;
        }
        for(char c : string.toCharArray())  {
            if(Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if(string == null || string.length() == 0){
            return false;
        }
        for(char c : string.toCharArray())  {
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return string != null && string.matches("[^a-sA-Z0-9]");

    }
}
