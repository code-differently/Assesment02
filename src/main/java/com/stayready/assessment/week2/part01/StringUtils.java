package com.stayready.assessment.week2.part01;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String result = stringToBeRepeated.repeat(numberOfTimeToRepeat);
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        boolean result;
        if (string.contains("[a-zA-Z]+") == false && string.length() > 2) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        String regex = "\\d+";
        boolean result;
        if (string.matches(regex)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        String specialCharacters = "[" + "-/@#!*$%^&.'_+={}()" + "]+";
        boolean result;
        if (string.matches(specialCharacters)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
