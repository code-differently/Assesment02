package com.stayready.assessment.week2.part02;


public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints)
    {
        int count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % 2 > 0)
            {
                count++;
            }
        }
        Integer [] result = new Integer[count];
        count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % 2 > 0)
            {
                result[count++] = ints[i];
            }
        }
        return result;
        
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) 
    {
        int count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % 2 == 0)
            {
                count++;
            }
        }
        Integer [] result = new Integer[count];
        count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % 2 == 0)
            {
                result[count++] = ints[i];
            }
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) 
    {
        int count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % 3 != 0)
            {
                count++;
            }
        }
        Integer [] result = new Integer[count];
        count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % 3 != 0)
            {
                result[count++] = ints[i];
            }
        }
        return result;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple)
    {
        int count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % multiple > 0)
            {
                count++;
            }
        }
        Integer [] result = new Integer[count];
        count = 0;
        for (int i = 0; i < ints.length; i++)
        {
            if(ints[i] % multiple > 0)
            {
                result[count++] = ints[i];
            }
        }
        return result;
    }
}
