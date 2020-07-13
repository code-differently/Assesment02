package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        int count = 0;
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--){
            reverse += input.charAt(i);
        }
        return count;
    }
}
