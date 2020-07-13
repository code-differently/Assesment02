package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j)
    {
        int howMany = 0;
        for (int i = 0; i< k;)
        {
            howMany++;
            i+=j;
        }
        return howMany;
    }
}
