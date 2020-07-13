package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String newString = "";
        newString = String.format("%"+ Integer.toString(amountOfPadding) + "s",stringToBePadded);

        return newString;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String newString = "";
        newString = String.format("%-"+ Integer.toString(amountOfPadding) + "s",stringToBePadded);

        return newString;

    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String str = stringToBeRepeated;
        String repeated = str.repeat(numberOfTimeToRepeat);
        return repeated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        Boolean verdict = true;
        char[] chars = string.toCharArray();

        for (char c : chars) {
            if(!Character.isLetter(c)) {
                verdict = false;
            }
        }
        return verdict;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        Boolean verdict = false;
        if(string.matches("[0-9]+") && string.length() > 2) {
            verdict = true;
        }

        return verdict;
    }


    public static Boolean isSpecialCharacterString(String string) {
        String splChrs = "-/@#$%^&_+=()";
        boolean found = string.matches("[" + splChrs + "]+");
        return found;
    }
}
