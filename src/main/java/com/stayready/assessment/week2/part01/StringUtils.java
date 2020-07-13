package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        return null;
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {
        return null;
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        String s = stringToBeRepeated;
        for (int i = 0; i<numberOfTimeToRepeat; i++)
        {
            stringToBeRepeated = stringToBeRepeated +s;
        }
        stringToBeRepeated+=" ";
        return stringToBeRepeated.trim();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) {
       char ch[] = string.toCharArray();

       for(int i = 0;i<ch.length-1;i++)
       {
           Character character = ch[i];
           Character c = ' ';
           if((!Character.isAlphabetic((int)character) && (!character.equals(c))))
           {
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
        char ch[] = string.toCharArray();

        for (int i = 0; i< string.length()-1; i++)
        {
            Character character = ch[i];
            if((!Character.isDigit(character)))
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
    public static Boolean isSpecialCharacterString(String string) {
        char ch[] = string.toCharArray();

        for(int i = 0; i<string.length()-1; i++)
        {
            Character character = ch[i];
            if(Character.isAlphabetic((int) character))
            {
                return false;
            }
            if(Character.isDigit((int) character))
            {
                return false;
            }
        }
        
        return true;
    }
}
