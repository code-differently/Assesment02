package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding  - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
//        String space="";
//        for(int i = 0; i <=amountOfPadding; i++) {
//            space+=" ";
//        }
//
//        return space+stringToBePadded;
        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding  - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
//        for(int i = 0; i <amountOfPadding; i++) {
//            stringToBePadded+=" ";
//        }
//        return stringToBePadded;
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated   - string value to be repeated
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
        for (int i = 0; i < string.length(); i++) {
            if ((string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') ||
                    ( string.charAt(i)>= 'a' && string.charAt(i) <= 'z')) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.matches("[0-9]+")){
                return true;
            }
        }
        return false;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return !isAlphaString(string)&&(!isNumericString(string));
    }
}