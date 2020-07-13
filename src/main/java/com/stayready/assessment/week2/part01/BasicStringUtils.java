package com.stayready.assessment.week2.part01;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2)
    {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1)
    {
        char temp[] = string1.toCharArray();  
        String result = "";  
        for(int i = temp.length-1; i >= 0; i--) //starts from end of string array
        {  
            result+=temp[i];  
        }  
        return result;  
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2)
    {   
        char temp1[] = string1.toCharArray(); //converts string1 to an array
        char temp2[] = string2.toCharArray(); //converts string2 to an array 
        String result1 = "";  
        String result2 = ""; 
        for(int i = temp1.length-1; i >= 0; i--)
        {  
            result1+=temp1[i];  
        } 
        for(int i = temp2.length-1; i >= 0; i--)
        {  
            result2+=temp2[i];  
        }
        String answer = result1 + result2;
    
        return answer;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove)
    {   
        String result = "";
        if (string.contains(charactersToRemove))
        {
             result = string.replaceAll(charactersToRemove , "");
        }
        return result;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove)
    {   
        String result = "";
        if (string.contains(charactersToRemove))
        {
             result = string.replaceAll(charactersToRemove , "");
        }

        char temp1[] = result.toCharArray();
        String result1 = "";  
        for(int i = temp1.length-1; i >= 0; i--) //starts from end of string array
        {  
            result1+=temp1[i];  
        }  
        
        return result1;
    }
}
