package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumperHeight) {
        if(flagHeight<=109 && flagHeight>=1 && jumperHeight<=109 && jumperHeight>=1){
            if((flagHeight%jumperHeight)==0)
                return flagHeight/jumperHeight;
            else
                return jumperHeight;


        }
        else 
            return -1;
    }
}
