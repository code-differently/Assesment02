package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfPadding; i++) {
            stringBuilder.append(' ');
        }

        return stringBuilder.substring(stringToBePadded.length()) + stringToBePadded;

    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < amountOfPadding; i++) {
            stringBuilder.append(' ');
        }

        return stringToBePadded +stringBuilder.substring(stringToBePadded.length());
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String repeatedString = " ";
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            repeatedString += stringToBeRepeated;

        }
        return repeatedString.trim();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        for(int i = 0; i < string.length(); i++){
            char stringCharacters = string.charAt(i);
            if(!Character.isLetter(stringCharacters) && string.charAt(i) !=' ') {
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
        for(int i = 0; i < string.length(); i++){
            if(!Character.isDigit(string.charAt(i))){
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
        boolean count = true;
        for(int i = 0; i < string.length(); i++){
            char stringCharacters = string.charAt(i);
            if(Character.isLetter(stringCharacters)  || (Character.isDigit(string.charAt(i)))){
                count = false;
                break;
            }
        }
        return count;
    }
}
