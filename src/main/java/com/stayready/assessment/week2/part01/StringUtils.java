package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        String padding = "";
        int needed_padding = amountOfPadding - stringToBePadded.length();
        while (needed_padding != 0)
        {
            padding = padding + " ";
            needed_padding--;
        }
        return padding + stringToBePadded;
    }

    //my uderstanding of padding is that it its a set value of space NOT including the string you want to pad,
    //how i did it in the way that makes a test pass.
    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        String padding = "";
        int needed_padding = amountOfPadding - stringToBePadded.length();
        while (needed_padding != 0)
        {
            padding = padding + " ";
            needed_padding--;
        }
        return stringToBePadded + padding;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {

        int count = numberOfTimeToRepeat;
        String duplicated = "";
        while (count != 0)
        {
            duplicated = duplicated + stringToBeRepeated;
            count--;
        }
        return duplicated;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    //ask about .matches regex syntax later
    public static Boolean isAlphaString(String string) {
        boolean outcome = true;
        String[] words = string.split(" ");

        int index = 0;
        while (index < words.length)
        {
            if (!words[index].matches("[a-zA-Z]+")){
                outcome = false;
                break;
            }
            index++;
        }
        return outcome;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        boolean outcome = true;
        String[] words = string.split(" ");

        int index = 0;
        while (index < words.length)
        {
            if (!words[index].matches("[0-9]+")){
                outcome = false;
                break;
            }
            index++;
        }
        return outcome;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {

//        boolean outcome = true;
//
//        if (isNumericString(string) || isAlphaString(string))
//        {
//            outcome = false;
//        }
//        else {
//            outcome = true;
//        }
//
//        return outcome;
        boolean outcome = true;
        String[] words = string.split(" ");

        int index = 0;
        while (index < words.length)
        {
            if (!words[index].matches("[" + "-/@#!*$%^&.'_+={}()"+ "]+")){
                outcome = false;
                break;
            }
            index++;
        }
        return outcome;
    }
}
