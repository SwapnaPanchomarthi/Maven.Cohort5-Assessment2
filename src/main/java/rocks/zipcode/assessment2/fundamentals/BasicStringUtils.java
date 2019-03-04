package rocks.zipcode.assessment2.fundamentals;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1+string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        StringBuilder str1 = new StringBuilder();
        str1.append(string1);
        str1 = str1.reverse();
        return str1.toString();
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        StringBuilder str1 = new StringBuilder();
        str1.append(string1);
        str1 = str1.reverse();
        StringBuilder str2 = new StringBuilder();
        str2.append(string2);
        str2 = str2.reverse();
        StringBuilder newString = str1.append(str2);

        return (newString).toString();
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove)
    {

    StringBuilder sb=new StringBuilder(string);
        sb = sb.reverse();

     char[] c = string.toCharArray();
        char[] ch = charactersToRemove.toCharArray();
        String new_Str = "";
        for (int i = 0; i < c.length; i++) {


                if (!(c[i] == ch[0]))
                    new_Str += c[i];
            }

        /*StringBuilder sb = new StringBuilder(string);
        char[] letters = string.toCharArray();*/

        return new_Str;
    }





    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        char[] c = string.toCharArray();
        char[] ch = charactersToRemove.toCharArray();
        String new_Str = "";
        for (int i = 0; i < c.length; i++) {

            if (!(c[i] == ch[0]))
                new_Str += c[i];
        }



        return reverse(new_Str);
    }
}
