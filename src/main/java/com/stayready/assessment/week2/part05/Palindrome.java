package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input){

        String str;
        int countSubstrings = input.length();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 2; j < input.length(); j++) {
                str = input.substring(i, j);
                countSubstrings += isPalindrome(str);
            }
            
        }
        return countSubstrings;
}

public static int isPalindrome(String theCount){
    for(int i = 0; i < theCount.length(); i++){
        if(theCount.charAt(i) != theCount.charAt(theCount.length() - 1 - i)){
            return 0;
        }
            
    }
    return 1;
    }
}
