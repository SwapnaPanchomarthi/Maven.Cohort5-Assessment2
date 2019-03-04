package rocks.zipcode.assessment2.fundamentals;

public class PredicateUtilities {
    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 2
     */
    public static Boolean isEven(Integer value) {
        boolean flag = false;
        if(value%2==0)
            flag = true;
        else flag = false;

        return flag;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is not a multiple of 2
     */
    public static Boolean isOdd(Integer value) {
        boolean flag = false;
        if(value%2==1)
            flag = true;
        else flag = false;

        return flag;
    }

    /**
     * @param value - the value to be evaluated
     * @return true if `value` is a multiple of 3
     */
    public static Boolean isMultipleOf3(Integer value) {
        boolean flag = false;
        if(value%3==0)
            flag = true;
        else flag = false;

        return flag;
    }

    /**
     *
     * @param value - the value to be evaluated
     * @param multiple - the multiple to test `value` against
     * @return true if `value` is a multiple of `multiple`
     */
    public static Boolean isMultipleOfN(Integer value, Integer multiple)
    {
        boolean flag = false;
        if(value%multiple==0)
            flag = true;
        else flag = false;

        return flag;


    }

    /**
     * @param string - the string to be evaluated
     * @return true if `string` starts with a capital letter
     */
    public static Boolean startsWithCapitalLetter(String string) {
        boolean flag = false;
        char[] c = string.toCharArray();
        if (Character.isUpperCase(c[0]))
            flag =true;
        else  flag = false;

        return flag;
    }
}
