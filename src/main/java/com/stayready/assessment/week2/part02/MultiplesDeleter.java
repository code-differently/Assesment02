package com.stayready.assessment.week2.part02;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        int count=0;
        int index=0;
        for (Integer num : ints) {
            if(num%2==1)
                count++;
        }
        Integer[] removed= new Integer[count];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%2==1){
                removed[index]=ints[i];
                index++;
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        int count=0;
        int index=0;
        for (Integer num : ints) {
            if(num%2==0)
                count++;
        }
        Integer[] removed= new Integer[count];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%2==0){
                removed[index]=ints[i];
                index++;
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        int count=0;
        int index=0;
        for (Integer num : ints) {
            if(num%3!=0)
                count++;
        }
        Integer[] removed= new Integer[count];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%3!=0){
                removed[index]=ints[i];
                index++;
            }
        }
        return removed;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        int count=0;
        int index=0;
        for (Integer num : ints) {
            if(num%multiple!=0)
                count++;
        }
        Integer[] removed= new Integer[count];
        for (int i = 0; i < ints.length; i++) {
            if(ints[i]%multiple!=0){
                removed[index]=ints[i];
                index++;
            }
        }
        return removed;
    }
}
