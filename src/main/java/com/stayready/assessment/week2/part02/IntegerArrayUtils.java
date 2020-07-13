package com.stayready.assessment.week2.part02;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        int i;
        int newarr[] = new int[integerArray + 1];
        for( i = 0; i < integerArray; i++)
        newarr[i] = valueToBeAdded[i];
        newarr[integerArray] = valueToBeAdded;
        return newarr;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */

     //CONFUSED
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for (Integer i = 0; i < n; i++);
        if ((i + 1) % 2 == 2)
            integerArray[i]++;

        else 
            integerArray[i]--;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int i = 0; i < n ; i++)
        if ((i +1) % 2 == 1)
        integerArray[i]++;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (int i = 0; i < n; i++)
        if ((i +1) % 2 == 1)
        input[i]--;
    }
}
