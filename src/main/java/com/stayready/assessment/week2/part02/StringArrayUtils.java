package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if(startingIndex < 0){
            throw new IllegalArgumentException("Index invalid!");
        }
        String error = arrayToBeSpliced[startingIndex];
        ArrayList<String> newArray = new ArrayList<String>();
        int count = 0;
        for(String s: arrayToBeSpliced){
            if(count>= startingIndex && count<endingIndex){
                newArray.add(s);
            }
            count++;
        }
        String[] result = {"a"};
        return newArray.toArray(result);
        
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String error = arrayToBeSpliced[startingIndex];
        ArrayList<String> newArray = new ArrayList<String>();
        int count = 0;
        for(String s: arrayToBeSpliced){
            if(count>= startingIndex){
                newArray.add(s);
            }
            count++;
        }
        String[] result = {"a"};
        return newArray.toArray(result);
    }
}
