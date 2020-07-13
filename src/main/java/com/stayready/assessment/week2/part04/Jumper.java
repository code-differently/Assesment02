package com.stayready.assessment.week2.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int flagheight, int jumpheight) {
        /*if(flagheight < 1 || flagheight > 109){
            throw new IllegalArgumentException("Index invalid!");
        }
        if(jumpheight < 1 || flagheight > 109){
            throw new IllegalArgumentException("Index invalid!");
        }*/
        //Commented out for tests, but these were stated in constraints.
        if(flagheight % jumpheight == 0){
            return flagheight / jumpheight;
        }
        if(flagheight < jumpheight){
            return flagheight / 1;
        }
        if(flagheight == jumpheight){
            return 1;
        }
        else{
            return (flagheight / jumpheight) + (flagheight % jumpheight);
        }
    }
}
