package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight)
    {
        if(flagHeight % jumpHeight == 0)
        {
            return flagHeight / jumpHeight;
        }

        if(flagHeight < jumpHeight)
        {
            return flagHeight / 1;
        }
        if(flagHeight == jumpHeight)
        {
            return 1;
        }
        else
        {
            return (flagHeight / jumpHeight) + (flagHeight % jumpHeight);
        }
    }
}
