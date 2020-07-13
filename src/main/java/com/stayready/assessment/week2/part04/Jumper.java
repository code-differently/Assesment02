package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumps=0;
        if((j <= 109&&j>=1) && (k <= 109&&k>=1)){
            jumps=k/j;
        }
        return jumps;
    }
}
