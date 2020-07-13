package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {

        if(k%j !=0)
        {
            return j;
        }
        else if(k < j)
        {
            return k;
        }
        
        return k/j;
    }
}
