package com.stayready.assessment.week2.part02;

public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex)
    {
      int n = endingIndex-startingIndex;
      String newArray[] = new String[n];

      for(int i=0; i<newArray.length; i++)
      {
         newArray[i] = arrayToBeSpliced[startingIndex+i];
      }
      return newArray;
    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
      
      int n = arrayToBeSpliced.length - startingIndex;
      String newArray[] = new String[n];

      for(int i=0; i<newArray.length; i++)
      {
         newArray[i] = arrayToBeSpliced[startingIndex+i];
      }
      return newArray;
    }
}
