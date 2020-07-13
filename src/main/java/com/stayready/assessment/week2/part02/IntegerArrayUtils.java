package com.stayready.assessment.week2.part02;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class IntegerArrayUtils {
    /**
     * @param integerArray - array to have value added to it
     * @param valueToBeAdded - value to be added to the end of the array
     * @return - identical array with one additional element of `valueToBeAdded` at the end of the array
     */
    public static Integer[] add(Integer[] integerArray, Integer valueToBeAdded) {
        
        
        ArrayList<Integer> addvalue = new ArrayList<Integer>();
        
        for(Integer i : integerArray){
        addvalue.add(i);
        }
        addvalue.add(valueToBeAdded);
        Integer[] newadd = {addvalue.size()};
        return addvalue.toArray(newadd);
    }

        // Convert ArrayList to Array
       // Integer[] array = list.toArray(new Integer[0]);
    
    

    /**
     * @param integerArray - array to be manipulated
     * @param indexToInsertAt - index of the element to be inserted at
     * @param valueToBeInserted - value of the element to be inserted
     * @return `integerArray` with `valueToBeInserted` at index number `indexToInsertAt`
     */
    public static Integer[] replace(Integer[] integerArray, int indexToInsertAt, Integer valueToBeInserted) {
        ArrayList<Integer> insertValue = new ArrayList<Integer>();
        for(int i = 0; i<integerArray.length;i++){
                         if(i==indexToInsertAt){
                         insertValue.add(valueToBeInserted);
            }


            else{
                    insertValue.add(integerArray[i]);
            }
        }
        Integer[] newinsert = {insertValue.size()};
        return insertValue.toArray(newinsert);
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
        
        
        
        return null;
    }

    /**
     * @param integerArray - array to be evaluated
     * @return identical array with even-values incremented by 1
     */
    public static Integer[] incrementEven(Integer[] integerArray) {
        return null;
    }

    /**
     * @param input - array to be evaluated
     * @return identical array with odd-values decremented by 1
     */
    public static Integer[] decrementOdd(Integer[] input) {
        return null;
    }
}
