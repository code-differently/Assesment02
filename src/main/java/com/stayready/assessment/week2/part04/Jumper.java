package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumpsTaken = 0;
        int flagHeight = k;
        int jumpHeight = j;
        if(flagHeight>=1 && flagHeight<=109)
            if(jumpHeight>=1 && jumpHeight<=109){
                if(flagHeight % jumpHeight == 0){
                    jumpsTaken = flagHeight / jumpHeight;
                }
                else{
                    jumpsTaken = jumpHeight;

                }
            }
        return jumpsTaken;
    }
}
