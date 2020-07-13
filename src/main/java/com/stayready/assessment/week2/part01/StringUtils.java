package com.stayready.assessment.week2.part01;

public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) 
    {
        
        if (stringToBePadded.length() >= amountOfPadding)
        {
            return stringToBePadded;
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (stringBuilder.length() < amountOfPadding - stringToBePadded.length())
        {
            stringBuilder.append(" ");
        }
        stringBuilder.append(stringToBePadded);
        return stringBuilder.toString();
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) 
    {
        if (stringToBePadded.length() >= amountOfPadding)
        {
            return stringToBePadded;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(stringToBePadded);
        
        while (stringBuilder.length() < amountOfPadding)
        {
            stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) 
    {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberOfTimeToRepeat;i++)
        {
            stringBuilder.append(stringToBeRepeated);
        }
        return stringBuilder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alphabetic a-z characters
     */
    public static Boolean isAlphaString(String string) 
    {
       char [] charArray = string.toCharArray();

     for (int i = 0; i < charArray.length;i++)
     {
         
         if (!(Character.isLetter(charArray[i])) && !(Character.isSpace(charArray[i])))
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
    public static Boolean isNumericString(String string) 
    {
        char [] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length;i++)
        {
            
            if (!(Character.isDigit(charArray[i])) && !(Character.isSpace(charArray[i])))
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
        char [] charArray = string.toCharArray();

        for (int i = 0; i < charArray.length;i++)
        {
            
            if ((Character.isLetterOrDigit(charArray[i])) && !(Character.isSpace(charArray[i])))
            {
                return false;
            }
   
        }
        return true;
    }
}
