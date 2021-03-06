package rocks.zipcode.assessment2.fundamentals;

/**
 * @author leon on 28/11/2018.
 */
public class StringUtils {
    /**
     * @param stringToBePadded - string value to be flushed right
     * @param amountOfPadding - amount of padding to be flushed left
     * @return `stringToBePadded` flushed right by left-padding
     */
    public static String padLeft(String stringToBePadded, int amountOfPadding) {
        StringBuilder builder = new StringBuilder(stringToBePadded);

        builder = builder.reverse(); // reverse initial string

        while(builder.length()<amountOfPadding) {

            builder.append(" "); // append at end

        }

        return builder.reverse().toString(); //
    }

    /**
     * @param stringToBePadded - string value to be flushed left
     * @param amountOfPadding - amount of padding to be flushed right
     * @return `stringToBePadded` flushed right by right-padding
     */
    public static String padRight(String stringToBePadded, int amountOfPadding) {

            StringBuilder builder = new StringBuilder(stringToBePadded);

            while(builder.length()<amountOfPadding) {

                builder.append(" ");

            }

            return builder.toString();

        }

    /**
     * @param stringToBeRepeated - string value to be repeated
     * @param numberOfTimeToRepeat - number of times to repeat `stringToBeRepeated`
     * @return the string repeated and concatenated `n` times
     */
    public static String repeatString(String stringToBeRepeated, int numberOfTimeToRepeat) {
        StringBuilder builder = new StringBuilder(stringToBeRepeated);
        int count =1;
        while(count<numberOfTimeToRepeat) {

            builder.append(stringToBeRepeated);
            count++;

        }
        return builder.toString();
    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains alpha characters
     */
    public static Boolean isAlphaString(String string) {

       /* return (!string.equals(""))
                || (string != null)
                || (string.matches("^[a-zA-Z0-9]+$"));*/
       return string.matches("[a-zA-Z0-9]*\"");

    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains numeric characters
     */
    public static Boolean isNumericString(String string) {


       // return string.matches(".*\\d+.*");
        return string.matches("[a-zA-Z0-9]*\"");


    }

    /**
     * @param string - string to be evaluated
     * @return - true if string only contains special characters
     */
    public static Boolean isSpecialCharacterString(String string) {
        return string.matches("[a-zA-Z0-9]*\"");

    }
}
