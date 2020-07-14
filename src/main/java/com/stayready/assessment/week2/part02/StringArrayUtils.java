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
        List<String> list = Arrays.asList(arrayToBeSpliced);
        //list.subList(startingIndex,endingIndex);

        return list.subList(startingIndex,endingIndex).toArray(new String[0]);
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        List<String> list = Arrays.asList(arrayToBeSpliced);
        return list.subList(startingIndex,arrayToBeSpliced.length).toArray(new String[0]);
    }
}
