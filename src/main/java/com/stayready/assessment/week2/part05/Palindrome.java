package com.stayready.assessment.week2.part05;

public class Palindrome {
    //dynamic programming problem 
    public Integer countPalindromes(String input){
        int counter = 0;
        int n = input.length();
        if(input == null || n == 0){
            return counter;
        }
        //our dp array to store truth values 
        boolean[][] dp = new boolean[n][n];

        //populate the array with true values
        for(int i = 0; i< n; i++){
            dp[i][i] = true;
            counter++;
        }

        for(int i = 1; i <n; i++){
            if(input.charAt(i-1) == input.charAt(i)){
                dp[i-1][i] = true; 
                counter++;
            }
        }
        for(int j = 2; j < n; j++){
            for(int i = 0; i < j; i++){
                if(dp[i+1][j-1] && input.charAt(i) == input.charAt(j)){
                    dp[i][j] = true; 
                    counter++;
                }

            }

        }


        return counter;
    
    }
}
