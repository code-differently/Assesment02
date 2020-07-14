package com.stayready.assessment.week2.part01;

import java.util.regex.Pattern;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return String.format("%1$-" + amountOfPadding + "s", stringToBePadded);
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String concatenet="";
        Integer count=1;
        while(count<=numberOfTimeToRepeat){
            concatenet+=stringToBeRepeated;
            count++;
        }
        return concatenet;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {

//        Pattern p = Pattern.compile( "[0-9]" );
//        Matcher m = p.matcher( s );
        if (string.matches("^[a-zA-Z].*")) {
            return true;
        }
        else{return false;}

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        if(string.matches("^[0-9].*")){
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
       // if(string.matches("^[A-Za-z0-9\\s]+")){
        if(string.matches(".*[$&+,:;=?@#|].*")){
            return true;
        }
        else{
            return false;}
    }
}
