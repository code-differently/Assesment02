package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumps) {
        if(flagHeight <= 109 && jumps >= 1 && jumps <= 109 && jumps >= 1){
            if((flagHeight % jumps) == 0)
                return flagHeight / jumps;
            else{
                return jumps;
            }
        }
        else {
            return -1;
        }
    }
}
