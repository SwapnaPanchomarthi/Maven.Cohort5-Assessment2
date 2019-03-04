package rocks.zipcode.assessment2.arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 28/11/2018.
 */
public class StringArrayUtils {
    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @param endingIndex - ending index of array
     * @return an array with all elements between `startingIndex` and `endingIndex`
     */
    public static String[] getSubArray(String[] arrayToBeSpliced, int startingIndex, int endingIndex) {
        List<String> list =new ArrayList<>(Arrays.asList(arrayToBeSpliced));



              //  if(startingIndex<list.size()){
                 list.subList(startingIndex, endingIndex);
        String[] newStr = new String[list.size()];
            list.toArray(newStr);
            return newStr;
               // else




      /* int n=endingIndex-startingIndex;
        String[] slice = new String[n];
        for (int i = 0; i < slice.length; i++) {
            slice[i] = arrayToBeSpliced[startingIndex + i];
        }*/




    }


    /**
     * @param arrayToBeSpliced - array to be evaluated
     * @param startingIndex - starting index of array to be spliced
     * @return an array all elements between after `startingIndex`
     */
    public static String[] getEndingArray(String[] arrayToBeSpliced, int startingIndex) {
        List<String> list = new ArrayList<String>(Arrays.asList(arrayToBeSpliced));

        String[] newStr = new String[list.size()];


            list.remove(startingIndex);

            list.toArray(newStr);



        return newStr;
    }
}
