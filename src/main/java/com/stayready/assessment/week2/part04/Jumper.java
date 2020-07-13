package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {  //(flagHeight, jumpHeight)
        
        int closestDivisibleNumber = 1;
        while ((j * closestDivisibleNumber) <= k){
            closestDivisibleNumber++;
        }

        closestDivisibleNumber--;

        return (k - (j * closestDivisibleNumber) + closestDivisibleNumber);
    }
}
