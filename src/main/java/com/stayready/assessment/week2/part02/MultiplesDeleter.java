package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> no_evens = new ArrayList<>();

        for (int index = 0; index < ints.length; index++)
        {
            if (ints[index] % 2 == 1)
            {
                no_evens.add(ints[index]);
            }
        }

        //ask about casting arraylist to integer object type array
        Integer[] newList = no_evens.toArray(new Integer[0]);
        return newList;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> no_odds = new ArrayList<>();

        for (int index = 0; index < ints.length; index++)
        {
            if (ints[index] % 2 == 0)
            {
                no_odds.add(ints[index]);
            }
        }

        Integer[] newList = no_odds.toArray(new Integer[0]);
        return newList;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> wanted = new ArrayList<>();

        for (int index = 0; index < ints.length; index++)
        {
            if (!(ints[index] % 3 == 0))
            {
                wanted.add(ints[index]);
            }
        }

        Integer[] newList = wanted.toArray(new Integer[0]);
        return newList;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> wanted = new ArrayList<>();

        for (int index = 0; index < ints.length; index++)
        {
            if (!(ints[index] % multiple == 0))
            {
                wanted.add(ints[index]);
            }
        }

        Integer[] newList = wanted.toArray(new Integer[0]);
        return newList;
    }
}
