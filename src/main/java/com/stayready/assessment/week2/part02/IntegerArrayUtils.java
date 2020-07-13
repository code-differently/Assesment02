package com.stayready.assessment.week2.part02;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer[] combined_arr = new Integer[integerArray.length + 1];

        for (int index = 0; index < combined_arr.length-1; index++)
        {
            combined_arr[index] = integerArray[index];
        }
        combined_arr[combined_arr.length-1] = valueToBeAdded;

        return combined_arr;
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
        for (int index = 0; index < integerArray.length; index++)
        {
            if (integerArray[index] % 2 == 0)
            {
                integerArray[index] = integerArray[index] + 1;
            } else {
                integerArray[index] = integerArray[index] - 1;
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for (int index = 0; index < integerArray.length; index++)
        {
            if (integerArray[index] % 2 == 0)
            {
                integerArray[index] = integerArray[index] + 1;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for (int index = 0; index < input.length; index++)
        {
            if (input[index] % 2 == 1)
            {
                input[index] = input[index] - 1;
            }
        }
        return input;
    }
}
