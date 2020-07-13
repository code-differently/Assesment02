package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int jumps = 0;

        jumps += flagHeight / jumpHeight;
        jumps += flagHeight % jumpHeight;

        return jumps;
    }
}
