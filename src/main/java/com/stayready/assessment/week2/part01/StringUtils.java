package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        int n = amountOfPadding - stringToBePadded.length();
        for(int i= 0; i < n; i++){
            stringToBePadded = " " + stringToBePadded;
        }
        return stringToBePadded;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        int n = amountOfPadding - stringToBePadded.length();
        for(int i= 0; i < n; i++){
            stringToBePadded= stringToBePadded + " ";
        }
        return stringToBePadded;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder temp = new StringBuilder(); 
        for(int i = 0; i < numberOfTimeToRepeat; i++){
            temp.append(stringToBeRepeated);
        }

        return temp.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
        string = string.replaceAll(" ", "");
        char[] chars = string.toCharArray();
        for(char c: chars){
            if(!Character.isLetter(c)){
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
       string = string.replaceAll(" ", "");
       return string.matches("-?\\d+(\\.\\d+)?");
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        string = string.replaceAll(" ", "");
        String specialChars = "-/@#$%^&_+=(){}*!";
        return string.matches("[" + specialChars + "]+");
    }
}
