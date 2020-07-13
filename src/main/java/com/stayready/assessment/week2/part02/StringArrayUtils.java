package com.stayready.assessment.week2.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        String[] answer = Arrays.copyOfRange(arrayToBeSpliced, startingIndex, endingIndex);
        return answer;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        String[] answer = Arrays.copyOfRange(arrayToBeSpliced, startingIndex, arrayToBeSpliced.length);
        return answer; 
        /* List<String> temp = new ArrayList<String>(); 
        for(int i = startingIndex; i < arrayToBeSpliced.length; i++){
            temp.add(i, arrayToBeSpliced[i]);
        }
        String[] answer = new String[temp.size()];
        answer = temp.toArray(answer);

        return answer; */
    }
}
