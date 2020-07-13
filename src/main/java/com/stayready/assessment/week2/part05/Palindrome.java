package com.stayready.assessment.week2.part05;

public class Palindrome {
    //CONFUSED
    public Integer countPalindromes(String input){
        int n = input.length();
        int result = 0;

        for(int i =0; i<n; i++){
            result += findPalin(input);
        }
        return result;

        //OR

        int count = input.length();
        for(int i = 0; i < input.length(); i++){
            for(int k = i+2; k <= input.length(); k++)
            {
                countPalin += isPalindrome(input.substring(i, k));
            }
            return countPalin;
        }
    }
}
