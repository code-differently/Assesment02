package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        /*int numOfEvens = 0;
        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % 2 == 0){
                numOfEvens++;
            }
        }

        Integer[] result = new Integer[numOfEvens];
        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % 2 == 0){
                result[idx] = ints[idx];
            }
        }*/

        ArrayList<Integer> oddsOnly = new ArrayList<>();
        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % 2 == 1){
                oddsOnly.add(ints[idx]);
            }
        }
        return oddsOnly.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> oddsOnly = new ArrayList<>();
        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % 2 == 0){
                oddsOnly.add(ints[idx]);
            }
        }
        return oddsOnly.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> oddsOnly = new ArrayList<>();
        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % 3 != 0){
                oddsOnly.add(ints[idx]);
            }
        }
        return oddsOnly.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> oddsOnly = new ArrayList<>();
        for (int idx = 0; idx < ints.length; idx++){
            if (ints[idx] % multiple != 0){
                oddsOnly.add(ints[idx]);
            }
        }
        return oddsOnly.toArray(new Integer[0]);
    }
}
