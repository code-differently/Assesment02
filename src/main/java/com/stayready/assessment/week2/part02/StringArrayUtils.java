
package com.stayready.assessment.week2.part02;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] subArr = new String[endingIndex-startingIndex];
        if(endingIndex <= arrayToBeSpliced.length && startingIndex >= 0) {
            int j = 0;

            for (int i = startingIndex; i < endingIndex; i++) {
                subArr[j] = arrayToBeSpliced[i];
                j++;
            }
            return subArr;
        }else
            return arrayToBeSpliced;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] subArr = new String[arrayToBeSpliced.length-startingIndex];
        int j=0;
        if(0<=startingIndex && startingIndex<=arrayToBeSpliced.length) {
            for (int i = startingIndex; i < arrayToBeSpliced.length; i++) {
                subArr[j] = arrayToBeSpliced[i];
                j++;
            }return subArr;
        }
        return null;
    }
}
