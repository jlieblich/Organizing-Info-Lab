import java.util.*;

public class Main {
    public static void main(String[] args) {
        //No code is needed in main
    }

    /**
     * Question 1: Find the smallest and largest numbers in an array
     *
     * You are given an array of integers, with at least two values.
     * Find the smallest and largest numbers in the array, and pass them back in an array containing two values,
     * the smallest and the largest.
     *
     * @param array An array of integers with at least two values
     * @return An array of integers with two elements, the largest and smallest from the method parameter
     */
    public static int[] findLargestAndSmallest(int array[]){
        int[] x = new int[2];
        Arrays.sort(array);
        x[1] = array[array.length-1];
        x[0] = array[0];
        return x;
    }


    /**
     * Questions 2
     *
     * Given a List of Integers, return the sum of the two largest values.
     *
     * If the array is empty, return 0.
     * If the array has one value, return that value.
     *
     * @param intList A List of integers of any size.
     * @return Sum of the two largest values
     */
    public static int sumOfTwoLargest(List<Integer> intList){
        if(intList.size() == 0)
            return 0;
        else if(intList.size() == 1) {
            return intList.get(0);
        } else {
            Collections.sort(intList);
            return intList.get(intList.size()-1) + intList.get(intList.size()-2);
        }

    }


    /**
     * Question3: Remove duplicates from a List
     *
     * You are given a List of Integers that might have duplicates. You must remove any duplicates from the List,
     * and return a List that doesn't contain duplicates. The order of the elements in the original List
     * does not need to be kept the same.
     *
     * You MAY use any collections types you wish, but the method must return a List.
     *
     * Example: [1,4,3,2,1] would return, in any order, [1,2,3,4]
     *
     * @param intList A List of Integers that may or may not include duplicates
     * @return A List of Integers that doesn't contain duplicates.
     */
    public static List<Integer> removeDuplicatesFromList(List<Integer> intList){
        boolean[] exists = new boolean[10];
        for(int i=0;i<10;i++) {
            exists[i] = false;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<intList.size();i++) {
            if(!exists[intList.get(i)]) {
                result.add(intList.get(i));
                exists[intList.get(i)] = true;
            }
        }
        return result;
    }


    //BONUS QUESTION IS BELOW

    /**
     * BONUS:
     *
     * Given two sorted arrays of integers, return a sorted array of the two original arrays merged together.
     * All valid numbers in these arrays are greater than 0.
     *
     * array1 has enough empty space (represented by the value 0) to hold all valid values from the original two arrays
     * combined. The returned array must be array1 with the new values merged in.
     *
     * For example:
     *      array1 = [1,4,7,9,0,0,0]
     *      array2 = [1,5,11]
     *      returned array = [1,1,4,5,7,9,11]
     *
     * No test cases are provided for this method, you will need to test it on your own.
     *
     * @param array1 Array of sorted integers
     * @param array2 Array of sorted integers
     * @return Array of sorted integers, merged from array1 and array2
     */
    public static int[] mergeSortedArrays(int[] array1, int[] array2){
        List<Integer> result = new ArrayList<>();
        for (int i : array1) {
            if (i != 0)
                result.add(i);
        }
        for(int i : array2) {
            if(i != 0)
                result.add(i);
        }
        Collections.sort(result);
        int[] resultArray = new int[result.size()];
        for(int i=0;i<result.size();i++) {
            resultArray[i] = result.get(i);
        }
        return resultArray;
    }
}
