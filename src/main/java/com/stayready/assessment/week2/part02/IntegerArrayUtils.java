package com.stayready.assessment.week2.part02;

import javax.swing.*;
import java.util.ArrayList;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer i : integerArray){
            result.add(i);
        }
        result.add(valueToBeAdded);
        return result.toArray(new Integer[0]);
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        integerArray[indexToInsertAt] = valueToBeInserted;
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return integerArray[indexToFetch];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for (int idx = 0; idx < integerArray.length; idx++){
            if (integerArray[idx] % 2 == 0){
                integerArray[idx]++;
            } else {
                integerArray[idx]--;
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int idx = 0; idx < integerArray.length; idx++){
            if (integerArray[idx] % 2 == 0){
                integerArray[idx]++;
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] integerArray) {
        for (int idx = 0; idx < integerArray.length; idx++){
            if (integerArray[idx] % 2 == 1){
                integerArray[idx]--;
            }
        }
        return integerArray;
    }
}
