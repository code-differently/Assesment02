package com.stayready.assessment.week2.part02;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        Integer newLength = integerArray.length;
        Integer [] newArray = new Integer[newLength + 1];
        for(int i = 0; i < newArray.length -1; i++){
            newArray[i] = integerArray[i];
            newArray[newArray.length -1] = valueToBeAdded;
        }
        return newArray;
    }

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        Integer newLength = integerArray.length;
        Integer [] newArray = new Integer[newLength + 1];
        for(int i = 0; i < newArray.length -1; i++){
            newArray[i] = integerArray[i];
            newArray[indexToInsertAt] = valueToBeInserted;
        }
        return newArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @param indexToFetch - index of element to be returned
     * @return element located at `indexToFetch`
     */
    public static Integer get(Integer[] integerArray, Integer indexToFetch) {
        int number = 0;
        for(int i = 0; i < integerArray.length; i++){
            if(i == indexToFetch){
                number = i;
                break;
            }
        }
        return integerArray[number];
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1 and odd-values decremented by 1
     */
    public static Integer[] incrementEvenDecrementOdd(Integer[] integerArray) {
        for(int i = 0; i < integerArray.length; i++){
            if(integerArray[i] % 2 == 0){
                integerArray[i] += 1;
            }else if(integerArray[i] % 2 != 0){
                integerArray[i] -=1;
            }
        }
        return integerArray;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        for(int i = 0; i < integerArray.length; i++) {
            if (integerArray[i] % 2 == 0) {
                integerArray[i] += 1;
            }
        }
        return integerArray;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        for(int i = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                input[i] -= 1;
            }
        }
        return input;

    }
}
