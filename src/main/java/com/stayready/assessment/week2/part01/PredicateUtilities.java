package com.stayready.assessment.week2.part01;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        return value % 2 == 0 ? true : false; //FANCY ternary operator again he he...
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {
        return value % 2 == 1 ? true : false;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        return value % 3 == 0 ? true : false;
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {
        return value % multiple == 0 ? true : false;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     * IF NOT CAPITAL, RETURNS FALSE....NO CAP!!!
     */
    public static Boolean startsWithCapitalLetter(String string) {
        Character capitalChar = string.charAt(0);
        return Character.isUpperCase(capitalChar) ? true : false;
    }
}
