package com.stayready.assessment.week2.part05;

import java.util.ArrayList;
import java.util.Stack;

public class Palindrome {
    public Integer countPalindromes(String input){
        ArrayList<String> arrList = new ArrayList<String>();
        Stack<Character> stackOfChars = new Stack<Character>();
        for(int i = 0; i < input.length(); i++) {
            for(int j = i + 1; j <= input.length(); j++) {
                arrList.add(input.substring(i, j));
            }
        }
        Integer numPalindromes = 0;
        for(String word: arrList) {
            int length = word.length();
            if(length == 1) {
                numPalindromes++;
            }
            else if(length > 1) {
                if(length % 2 == 0) {
                    for(int firstHalf = 0; firstHalf < length / 2; firstHalf++) {
                        stackOfChars.push(word.charAt(firstHalf));
                    }
                    for(int secondHalf = length / 2; secondHalf < length; secondHalf++) {
                        if(word.charAt(secondHalf) == stackOfChars.peek()) {
                            stackOfChars.pop();
                        }
                    }
                }
                //skipping the middle letter
                else if(length % 2 == 1) {
                    for(int firstHalf = 0; firstHalf < (length / 2); firstHalf++) {
                        stackOfChars.push(word.charAt(firstHalf));
                    }
                    for(int secondHalf = (length / 2) + 1; secondHalf < length; secondHalf++) {
                        if(word.charAt(secondHalf) == stackOfChars.peek()) {
                            stackOfChars.pop();
                        }
                    }
                }
                if(stackOfChars.empty()) {
                    numPalindromes++;
                }
                stackOfChars.clear();
            }
        }
        return numPalindromes;
    }
}
