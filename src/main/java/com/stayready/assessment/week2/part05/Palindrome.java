package com.stayready.assessment.week2.part05;

import java.util.ArrayList;
import java.util.Stack;

public class Palindrome {
    public Integer countPalindromes(String input){
        ArrayList<String> arrList = new ArrayList<String>();
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
            else if(length == 2) {
                char[] individualLetters = word.toCharArray();
                if(individualLetters[0] == individualLetters[1]) {
                    numPalindromes++;
                }
            }
            else if(length > 2) {
                if(length % 2 == 0) {
                    String firstHalf = word.substring(0, length / 2);
                    StringBuilder secondHalf = new StringBuilder();
                    secondHalf.append(word.substring(length/2)).reverse();
                    if(firstHalf.equals(secondHalf.toString())) {
                        numPalindromes++;
                    }
                }
                else if(length % 2 == 1){
                    String firstHalf = word.substring(0, length / 2);
                    StringBuilder secondHalf = new StringBuilder();
                    secondHalf.append(word.substring((length/2) + 1)).reverse();
                    if(firstHalf.equals(secondHalf.toString())) {
                        numPalindromes++;
                    }
                }
            }
        }
        return numPalindromes;
    }
}
