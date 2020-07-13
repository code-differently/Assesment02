package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int jumpCount = 0;
        if (k < j) {
            j = 1;
        }

        int totalJumped = j * jumpCount;
        while (totalJumped < k) {
            jumpCount++;
            totalJumped = j * jumpCount;
            if ((j * (jumpCount + 1)) > k) {
                j = 1;
                return jumpCount + (k - totalJumped);
            }
        }
        return jumpCount;
    }
}
