package com.stayready.assessment.week2.part02;

import java.util.ArrayList;

public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> putNums = new ArrayList<>();
        for(Integer num: ints) {
            if(num % 2 == 1) {
                putNums.add(num);
            }
        }
        Integer [] ans = new Integer[putNums.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = putNums.get(i);
        }

        return ans;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> putNums = new ArrayList<>();
        for(Integer num: ints) {
            if(num % 2 == 0) {
                putNums.add(num);
            }
        }
        Integer [] ans = new Integer[putNums.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = putNums.get(i);
        }

        return ans;
    }

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> putNums = new ArrayList<>();
        for(Integer num: ints) {
            if(num % 3 != 0) {
                putNums.add(num);
            }
        }
        Integer [] ans = new Integer[putNums.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = putNums.get(i);
        }

        return ans;
    }

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> putNums = new ArrayList<>();
        for(Integer num: ints) {
            if(num % multiple != 0) {
                putNums.add(num);
            }
        }
        Integer [] ans = new Integer[putNums.size()];
        for(int i = 0; i < ans.length; i++) {
            ans[i] = putNums.get(i);
        }

        return ans;
    }
}
