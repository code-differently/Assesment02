package com.stayready.assessment.week2.part02;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] ret = new String[endingIndex - startingIndex];

        for(int i = startingIndex; i < endingIndex; i++) {
            ret[i-startingIndex] = arrayToBeSpliced[i];
        }

        return ret;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] ret = new String[arrayToBeSpliced.length - startingIndex];

        for(int i = startingIndex; i < arrayToBeSpliced.length; i++) {
            ret[i-startingIndex] = arrayToBeSpliced[i];
        }

        return ret;
    }
}
