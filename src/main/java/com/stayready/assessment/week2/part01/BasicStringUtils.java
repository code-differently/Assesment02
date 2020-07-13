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
        return new StringBuilder(string1).reverse().toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2)
    {
        String new1 = new StringBuilder(string1).reverse().toString();
        String new2 = new StringBuilder(string2).reverse().toString();

        return new1 + new2;
    }


    static int[] getCharCountArray(String str)
    {
        int count[] = new int[256];
        for(int i = 0; i < str.length(); i++)
        {
            count[str.charAt(i)]++;
        }

        return count;
    }
    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove)
    {
        int count[] = getCharCountArray(charactersToRemove);

        int index1 = 0, index2 = 0;

        char arr[] = string.toCharArray();

        while(index1 != arr.length)
        {
            char temp = arr[index1];
            if(count[temp] == 0)
            {
                arr[index2] = arr[index1];
                index2++;
            }
            index1++;
        }

        string = new String(arr);

        return string.substring(0, index2);
    }
    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove)
    {
        return new StringBuilder(removeCharacters(string, charactersToRemove)).reverse().toString();
    }
}
