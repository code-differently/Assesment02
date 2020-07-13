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
        String[] result = new String[endingIndex - startingIndex];
        int jdx = 0;
        //ArrayList<String> result = new ArrayList<>();
        for (int idx = startingIndex; idx < endingIndex + 1; idx++){
            result[jdx] = arrayToBeSpliced[idx];
            jdx++;
            //result.add(arrayToBeSpliced[idx]);
        }
        return result;
        //return result.toArray(new String[0]);
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        return getSubArray(arrayToBeSpliced,startingIndex,arrayToBeSpliced.length -1);
    }
}
