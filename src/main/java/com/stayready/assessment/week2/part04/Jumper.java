package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    //Flagheight jumpheight
    public int jumps(int k, int j) {
        if(j >= k){
            return 1;
        }

        return 1 + jumps(k, j + j);
    }
}
