package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
        int current = 0;
        int count = 0;
        while (current != flagHeight) {
            int difference = flagHeight - current;
            if (difference >= jumpHeight) {
                current += jumpHeight;
            }
            else {
                current += 1;
            }
            count++;
        }

        return count;
    }
}
