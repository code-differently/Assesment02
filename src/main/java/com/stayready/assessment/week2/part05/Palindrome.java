package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input)
    {
        int count = input.length();

        for(int i = 0; i < input.length(); i++)
        {
            for(int j = i + 2; j <= input.length(); j++)
            {
                count += isPalindrome(input.substring(i, j));
            }
        }

        return count;
    }

    public static int isPalindrome(String input)
    {
        for(int i = 0; i < input.length() / 2; i++)
        {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i))
            {
                return 0;
            }
        }

        return 1;
    }
}
