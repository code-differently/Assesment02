package com.stayready.assessment.week2.part02;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        if(endingIndex>arrayToBeSpliced.length || startingIndex<=-1 || endingIndex<startingIndex){
            String[] blank={};
            return blank;
        }
        else{
            String[] splice=new String[endingIndex-startingIndex];
            for (int i = startingIndex,j=0; i < endingIndex; i++,j++) {
                splice[j]=arrayToBeSpliced[i];
            }
            return splice;
        }
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        if(startingIndex<=-1 || startingIndex>arrayToBeSpliced.length){
            String[] blank={};
            return blank;
        }
        else{
            String[] splice=new String[arrayToBeSpliced.length-startingIndex];
            for (int i = startingIndex,j=0; i < arrayToBeSpliced.length; i++,j++) {
                splice[j]=arrayToBeSpliced[i];
            }
            return splice;
        }
    }
}
