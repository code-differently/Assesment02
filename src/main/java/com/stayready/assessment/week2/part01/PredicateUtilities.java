package com.stayready.assessment.week2.part01;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        if(value % 2 == 0){
            return true;
        } else 
            return false;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {
        if(value % 2 != 0){
            return true;
        } else 
            return false;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        if(value % 3 == 0){
            return true;
        } else 
            return false;
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {
        return !(value % multiple !=0);
        /*
        int remainder = value % multiple;
        boolean multiple = true;

        if(remainder !=0){
            multiple = false;
        }
        return multiple;
        */
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    //CONFUSED
    public static Boolean startsWithCapitalLetter(String string) {
        boolean isUpperCase = Character.isUpperCase("".charAt(0));
        return isUpperCase;
/*
        if(string[0].isUpper()){
            return true;
        } else if(string[0].isLower())
            return false;
    }
    
*/
    }
}
