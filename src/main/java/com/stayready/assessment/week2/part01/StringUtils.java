package com.stayready.assessment.week2.part01;

import java.util.regex.Pattern;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < amountOfPadding; i++){
            builder.append(' ');
        }
        return builder.substring(stringToBePadded.length()) + stringToBePadded;

        //OR

        if(stringToBePadded.length() >= amountOfPadding){
            return stringToBePadded;
        }
        StringBuilder builder = new StringBuilder();
        while (builder.length() < amountOfPadding - stringToBePadded.length()){
            builder.append(' ');
        }
        builder.append(stringToBePadded);
        return builder.toString();
    }
    



    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1s-" + amountOfPadding + "s", stringToBePadded).replace(' ', "0");

        
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            builder.append(stringToBeRepeated);
        }

        return builder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        for(int i = 0; i < string.length();) {
            char alpha = string.charAt(i);
            if(!(alpha >= 'A' && alpha <= 'Z') && !(alpha >= 'a' && 'c' <= 'z')){
                return false;
            }
            return true;
        }
        return null;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for(int i = 0; i < string.length(); i++){
            if (!Character.isDigit(string.charAt(i)))
            return false;
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    //NOT SURE how to do this
    public static Boolean isSpecialCharacterString(String string) {
        return Pattern.compile("[@\b.]").matcher(string).find();
    }
}
