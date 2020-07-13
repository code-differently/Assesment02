package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        int count=input.length();
        for(int i=0; i<input.length(); i++) {
            for(int j=i+2; j<=input.length(); j++) {
                String value = input.substring(i, j);
                String rev = new StringBuilder(value).reverse().toString();
                if(value.equals(rev)) {
                    count++;
                }
            }
        }
        return count;
    }
}
