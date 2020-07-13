package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        int count = 0;

        for(int start = 0; start < input.length(); start++) {
            for(int end = start + 1; end <= input.length(); end++) {
                String currentSub;
                StringBuilder palindrome;

                currentSub = input.substring(start, end);
                palindrome = new StringBuilder(currentSub);
                palindrome.reverse();

                if(palindrome.toString().equals(currentSub)) {
                    count++;
                }
            }
        }

        return count;
    }
}
