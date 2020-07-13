package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding)
    {   String result;
        result = String.format("%" + amountOfPadding + "s", stringToBePadded);
        return result;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding)
    {
        String result;
        result = String.format("%" + -amountOfPadding + "s", stringToBePadded);
        return result;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat; i++)
        {
            sb.append(stringToBeRepeated);
        }
        return sb.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string)
    {   
        char temp[] = string.toCharArray();
        for (int i = 0; i < temp.length; i++)
        {
            if(Character.isAlphabetic(temp[i]))
            {
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
        return null;
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return null;
    }
}
