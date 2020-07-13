package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input) {
        int count = 0;
        String reverse = "";
        int length = input.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + input.charAt(i);

        if (input.equals(reverse)){
            count += 1;
        }
            return count;
    }
}

