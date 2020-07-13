package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        for(Integer i : ints){
            if(i % 2 != 0){
                oddList.add(i);
            }
        }
        return oddList.toArray(new Integer[oddList.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();

        for(Integer i : ints){
            if(i % 2 == 0){
                evenList.add(i);
            }
        }
        return evenList.toArray(new Integer[evenList.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> multList = new ArrayList<Integer>();

        for(Integer i : ints){
            if(i % 3 != 0){
                multList.add(i);
            }
        }
        return multList.toArray(new Integer[multList.size()]);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> newList = new ArrayList<Integer>();

        for(Integer i : ints){
            if(i % multiple != 0){
                newList.add(i);
            }
        }
        return newList.toArray(new Integer[newList.size()]);
    }
}
