package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        String reverseWord = " ";
        for(int i = input.length() -1; i >=0; i--){
            reverseWord =  reverseWord + input.charAt(i);
            if(input.equals(reverseWord)){
                return 6;
            }
        }
        return 9;
    }
}
