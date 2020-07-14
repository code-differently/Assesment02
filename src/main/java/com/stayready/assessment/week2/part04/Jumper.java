package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int numBiggerJumps = k/j;
        int numSmallerJumps = k%j;
        int totalNumJumps = numBiggerJumps + numSmallerJumps;
        return totalNumJumps;
    }
}
