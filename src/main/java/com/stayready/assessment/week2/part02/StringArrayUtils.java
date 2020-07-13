package com.stayready.assessment.week2.part02;

import java.util.Arrays;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] splicedArray= Arrays.copyOf(arrayToBeSpliced, endingIndex-startingIndex);
        if (!(startingIndex >arrayToBeSpliced.length) && !(startingIndex <0) && !(endingIndex <startingIndex)
        && !(endingIndex <0) && (endingIndex >arrayToBeSpliced.length)){
            for (int i = 0, j = 0; i < arrayToBeSpliced.length; i++) {
                if (i >= startingIndex && i < endingIndex) {
                    splicedArray[j] = arrayToBeSpliced[i];
                    j++;
                }
            }
        }else {
            splicedArray= new String[]{};
        }
        return splicedArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
            String[] splicedArray= Arrays.copyOf(arrayToBeSpliced, arrayToBeSpliced.length-startingIndex);
           if (!(startingIndex >arrayToBeSpliced.length) && !(startingIndex <0)){
               for (int i = 0, j = 0; i < arrayToBeSpliced.length; i++) {
                   if (i >= startingIndex) {
                       splicedArray[j] = arrayToBeSpliced[i];
                       j++;
                   }
               }
           }else {
               splicedArray= new String[]{};
           }
            return splicedArray;
    }
}
