package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String a = "";
        for (int i = 0; i < amountOfPadding; i++) {
            a += " ";
        }

        for (int i = 0; i < stringToBePadded.length(); i++) {
            a += stringToBePadded.charAt(i);
        }

        return a;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String a = "";

        for (int i = 0; i < stringToBePadded.length(); i++) {
            a += stringToBePadded.charAt(i);
        }

        for (int i = 0; i < amountOfPadding; i++) {
            a += " ";
        }

        return a;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String a = "";
        int i = 0;
        while (i < numberOfTimeToRepeat) {
            for (int j = 0; j < stringToBeRepeated.length(); j++) {
                a += stringToBeRepeated.charAt(j);
            }
            i++;
        }
        return a;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {

        boolean a = false;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i)))
                a = true;
            else
                a = false;
        }
        return a;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean a = false;

        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i)))
                a = true;
            else
                a = false;
        }
        return a;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        boolean a = false;

        for (int i = 0; i < string.length(); i++) {
            if (!Character.isLetter(string.charAt(i)) && !Character.isDigit(string.charAt(i)))
                a = true;
            else
                a = false;
        }
        return a;
    }
}
