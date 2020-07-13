package com.stayready.assessment.week2.part05;

import java.util.ArrayList;

public class Palindrome {
    public Integer countPalindromes(String input) {
        Integer count = 0;
        ArrayList<String> subRay = new ArrayList<String>();
        char[] chrArray = input.toCharArray();
        isPals(chrArray);
        for(int i=0; i<chrArray.length;i++){
            for(int j=i+1;j<=chrArray.length;j++){
                subRay.add(input.substring(i, j));
            }
        }
        for(String sub : subRay){
            char[] temp = sub.toCharArray();
            if(isPals(temp) == true){
                count++;
            }
        }


        return count;

    }

    public boolean isPals(char[] chr) {
        int palAdvance = 0;
        boolean isPal = true;
        palAdvance = chr.length / 2;
        for (int i = 0; i < palAdvance; i++) {
            if (chr[i] != chr[(chr.length-1) - i]) {
                isPal = false;
            }
        }
        return isPal;
    }

    
}
