package com.stayready.assessment.week2.part01;

import java.util.regex.Pattern;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding)
    {
        String newStr = "";
        for(int i = 1; i <= amountOfPadding; i++)
        {
            newStr += " ";
        }
        return "";
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding)
    {
        StringBuilder s = new StringBuilder();

        for(int i = 1; i <= amountOfPadding; i++)
        {
            s.append(" ");
        }

        return stringToBePadded + s.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat)
    {
        String s = "";

        for(int i= 1; i <= numberOfTimeToRepeat; i++)
        {
            s += s;
        }

        return s;

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string)
    {
        char[] chars = string.toCharArray();
        boolean getit = false;
        for(char c : chars)
        {
            if(!Character.isLetter(c))
            {
                getit = false;
            }
            else
            {
                getit = true;
            }
        }

        return getit;
    }


    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {
        char[] chars = string.toCharArray();

        for(char c : chars)
        {
            if(!Character.isDigit(c))
            {
                return false;
            }
        }
        return true;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string)
    {
        boolean res = false;
        for(char c : string.toCharArray())
        {
            if(!(Character.isLetter(c)) && !(Character.isDigit(c)))
            {
                res = true;
            }
            else
            {
                res = false;
            }
        }

        return false;
    }
}
