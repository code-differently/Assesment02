package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) 
    {
        ArrayList <Integer> getOdd = new ArrayList <Integer>();
        
        for (int i = 0; i < ints.length;i++)
        {
            if (ints[i] % 2 == 1)
            {
                getOdd.add(ints[i]);
            }
        }

        Integer [] returnArray = new Integer [getOdd.size()];
        getOdd.toArray(returnArray);
        return returnArray;

        
    
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) 
    {
        ArrayList <Integer> getEven = new ArrayList <Integer>();
        
        for (int i = 0; i < ints.length;i++)
        {
            if (ints[i] % 2 == 0)
            {
                getEven.add(ints[i]);
            }
        }
        
        Integer [] returnArray = new Integer [getEven.size()];
        getEven.toArray(returnArray);
        return returnArray;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) 
    {
        ArrayList <Integer> getNotThird = new ArrayList <Integer>();
        
        for (int i = 0; i < ints.length;i++)
        {
            if (ints[i] % 3 == 1)
            {
                getNotThird.add(ints[i]);
            }
        }
        
        Integer [] returnArray = new Integer [getNotThird.size()];
        getNotThird.toArray(returnArray);
        return returnArray;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) 
    {
        ArrayList <Integer> getNonMulti = new ArrayList <Integer>();
        
        for (int i = 0; i < ints.length;i++)
        {
            if (ints[i] % multiple != 0)
            {
                getNonMulti.add(ints[i]);
            }
        }
        
        Integer [] returnArray = new Integer [getNonMulti.size()];
        getNonMulti.toArray(returnArray);
        return returnArray;
    }
}
