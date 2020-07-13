package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String sub = input.substring(i, j);
                String rev = reverse(sub);
                if (sub.equals(rev)) {
                    count++;
                }
            }
        }
        return count;
    }
    public String reverse(String input) {
        StringBuilder rev = new StringBuilder(input);
        return rev.reverse().toString();
    }
}
