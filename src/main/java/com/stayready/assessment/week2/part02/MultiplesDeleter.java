package com.stayready.assessment.week2.part02;
import java.util.ArrayList;
public class MultiplesDeleter {
    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 2
     * given an array of integers, named `ints` return an identical array with evens removed
     */
    public Integer[] deleteEvens(Integer[] ints) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(Integer i: ints){


            if(i%2 != 0){
                newArray.add(i);
            }
        }
        Integer[] delevens = {newArray.size()};


        return newArray.toArray(delevens);
    }

    

    /**
     * @param ints array of Integer objects
     * @return all ints which are divisible by 2
     * given an array of integers, named `ints` return an identical array with odds removed
     */
    public Integer[] deleteOdds(Integer[] ints) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(Integer i: ints){
            if(i%2== 0){
                newArray.add(i);
            }
        }
        Integer[] deleteodd = {newArray.size()};
        return newArray.toArray(deleteodd);
    }

    

    /**
     * @param ints array of Integer objects
     * @return all ints which are not divisible by 3
     * given an array of integers, named `ints` return an identical array with numbers indivisible by 3 removed
     */
    public Integer[] deleteMultiplesOf3(Integer[] ints) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        for(Integer i: ints){
           
            if(i%3 != 0){
                
                newArray.add(i);
            }
        }
        Integer[] multiples = {newArray.size()};


        return newArray.toArray(multiples);
    }

    

    /**
     * @param ints array of Integer objects
     * @param multiple the multiple to evaluate divisibility against
     * @return all ints which are not divisible by the `multiple` specified
     * given an array of integers, named `ints` return an identical array with numbers indivisible by `multiple` removed
     */
    public Integer[] deleteMultiplesOfN(Integer[] ints, int multiple) {
        ArrayList<Integer> newArray = new ArrayList<Integer>();
        //for(Integer i: ints){ 
       
        return null;
        }
    }
