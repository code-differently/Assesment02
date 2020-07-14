package com.stayready.assessment.week2.part05;

import java.util.ArrayList;

public class Palindrome {
    public Integer countPalindromes(String input){
        ArrayList<String> arrList = new ArrayList<String>();
        String firstHalf = "";
        StringBuilder secondHalf = new StringBuilder();
        int length = 0;
        //generating all of the different ways the string can be arranged
        for(int i = 0; i < input.length(); i++) {
            for(int j = i + 1; j <= input.length(); j++) {
                arrList.add(input.substring(i, j));
            }
        }
        Integer numPalindromes = 0;
        for(String word: arrList) {
            length = word.length();
            if(length == 1) {
                numPalindromes++;
            }
            else if(length == 2) {
                if(word.substring(0, 1).equals(word.substring(1, 2))) {
                    numPalindromes++;
                }
            }
            else if(length > 2) {
                firstHalf = word.substring(0, length / 2);
                //clearing the contents
                secondHalf.setLength(0);
                if(length % 2 == 0) {
                    secondHalf.append(word.substring(length/2)).reverse();
                }
                else if(length % 2 == 1){
                    secondHalf.append(word.substring((length/2) + 1)).reverse();
                }
                if(firstHalf.equals(secondHalf.toString())) {
                    numPalindromes++;
                }
            }
        }
        return numPalindromes;
    }
}
