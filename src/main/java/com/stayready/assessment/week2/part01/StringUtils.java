package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        int paddingToAdd = amountOfPadding - stringToBePadded.length();
        String result = "";
        for (int idx = 1; idx <= paddingToAdd; idx++){
            result += " ";
        }
        result += stringToBePadded;
        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        int paddingToAdd = amountOfPadding - stringToBePadded.length();
        String result = "";
        for (int idx = 1; idx <= paddingToAdd; idx++){
            result += " ";
        }
        result = stringToBePadded + result;
        return result;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        /* Direct Way
        String result = "";
        for (int i = 1; i <= numberOfTimeToRepeat; i++){
            result += stringToBeRepeated;
        }
        return result;
        */

        // String Builder Way:
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= numberOfTimeToRepeat; i++){
            sb.append(stringToBeRepeated);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     * I DO NOT KNOW WHY THIS DOESN'T WORK - MALON
     */
    public static Boolean isAlphaString(String string) {
        for (int idx = 0; idx < string.length(); idx++){
            Character currChar = string.charAt(idx);
            //System.out.printf("-%s-", currChar);
            if (!(Character.isLetter(currChar) || Character.isSpaceChar(currChar))){
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
        for (int idx = 0; idx < string.length(); idx++){
            Character currChar = string.charAt(idx);
            if (!(Character.isDigit(currChar) || Character.isSpaceChar(currChar))){
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
        return null;
    }

    public static void main(String[] args){
        String alphaString = "The quick brown fox jumps";
        isAlphaString(alphaString);
    }
}
