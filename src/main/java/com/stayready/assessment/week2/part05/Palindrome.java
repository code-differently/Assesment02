package com.stayready.assessment.week2.part05;

public class Palindrome {
    public Integer countPalindromes(String input){
        if (input.length() == 0) {//If there is nothing in the string.
            return 0;
        }
        char[] chars = new char[2 * input.length() - 1];
        for (int i = 0; i < input.length(); i++) {
            chars[2 * i] = input.charAt(i);
        }
        int ans = 0;
        for (int i = 0; i < chars.length; i++) {//Goes through one letter at a time.
            int left = i; //Start in center and move out
            int right = i;
            while (left >= 0 && right <= chars.length - 1) {//helps keep left and right values in bound
                if (chars[left] == chars[right]) {//Checks to see if both values equal; r == r
                    if (left % 2 == 0) {//Palindrone check is here
                        ans++;
                    }
                    left--; //check left for extended palindromes
                    right++;//check right for extended palindrome
                } else {//values aren't equal so no palindrome; r != a
                    break; //to move to the next char in array.
                }
            }
        }
        return ans;
    }
}
