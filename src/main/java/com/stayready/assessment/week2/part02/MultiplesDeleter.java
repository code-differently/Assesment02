package com.stayready.assessment.week2.part02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        List<Integer> list= Arrays.asList(ints);

        int index=0;


       for(int i=0; i<=ints.length;i++){
            if(list.get(i)%2==0){
                list.remove(index);
            }
            index++;

       }
        return list.toArray(new Integer[0]);

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        List<Integer> list= Arrays.asList(ints);

        int index=0;


        for(int i=0; i<=ints.length;i++){
            if(list.get(i)%2!=0){
                list.remove(index);
            }
            index++;

        }
        return list.toArray(new Integer[0]);

    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        List<Integer> list= Arrays.asList(ints);

        int index=0;


        for(int i=0; i<=ints.length;i++){
            if(list.get(i)%3==0){
                list.remove(index);
            }
            index++;

        }
        return list.toArray(new Integer[0]);
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        List<Integer> list= Arrays.asList(ints);

        int index=0;


        for(int i=0; i<=ints.length;i++){
            if(list.get(i)%multiple==0){
                list.remove(index);
            }
            index++;

        }
        return list.toArray(new Integer[0]);

    }
}
