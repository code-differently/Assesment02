package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight)
    {
        if(jumpHeight == flagHeight)
        {
            return jumpHeight;
        }
        else
        {
            return jumps(flagHeight, jumpHeight + 1);
        }
    }
}
