package com.stayready.assessment.week2.part01;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String temp = "";
        temp = String.format("%"+ amountOfPadding +"s", stringToBePadded);
        return temp;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String temp = "";
        temp = String.format("%"+ -amountOfPadding + "s", stringToBePadded);
        return temp;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        String output = "";
        for(int i = 0; i < numberOfTimeToRepeat; i++) {

            output += stringToBeRepeated;
        }

        return output;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {

        char [] temp = string.toCharArray();
        boolean tempB = false;
        for(int i = 0; i < temp.length; i++) {
            if(Character.isLetter(temp[i])) {
                tempB = true;
            } else {

                tempB = false;
            }
        }
        return tempB;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        char [] temp = string.toCharArray();
        boolean tempB = false;
        for(int i = 0; i < temp.length; i++) {
            if(Character.isDigit(temp[i])) {
                tempB = true;
            } else {
                 return false;
            }
        }
        return tempB;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

        char [] temp = string.toCharArray();
        boolean tempB = false;
        for(int i = 0; i < temp.length; i++) {
            if(Character.isDigit(temp[i]) || Character.isLetter(temp[i])) {
                return false;
            }
            else {
                tempB = true;
            }
        }
        return tempB;

    }
}
