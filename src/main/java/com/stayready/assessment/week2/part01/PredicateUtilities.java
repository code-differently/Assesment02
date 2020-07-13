package com.stayready.assessment.week2.part01;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        boolean result;
        if (value % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {
        boolean result;
        if (value % 2 != 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        boolean result;
        if (value % 3 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     *
     * @param value    - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple) {
        boolean result;
        if (value % multiple == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        boolean result;
        if (Character.isUpperCase(string.charAt(0))) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}