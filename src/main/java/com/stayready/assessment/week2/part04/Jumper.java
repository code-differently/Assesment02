package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagHeight, int jumpHeight) {
       // int distance = flagHeight; 
        int minJumps = 0;
        //if flagHeight == jumpHeight
        if(flagHeight == jumpHeight){
            return minJumps = 1;
        } else if (flagHeight % jumpHeight == 0){
            minJumps = flagHeight / jumpHeight; 
            return minJumps;
        } else if (flagHeight < jumpHeight){
            minJumps = flagHeight;
            return minJumps;
        } else {
            minJumps = (flagHeight / jumpHeight) + (flagHeight % jumpHeight);
            return minJumps;
        }
    }
}
