package arrays.challenge.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    /**
     * Create a program using arrays, that sorts a list of integers, in descending order.
     * Descending order means from highest value to lowest.
     *
     * In other words, if the array has the values 50, 25, 80, 5 and 15 your program should return
     * an array, with the values in the descending order: 80, 50, 25, 15 and 5.
     *
     * First create an array of randomly generated integers.
     * Print the array before you sort it.
     * And print the array after you sort it.
     * You can choose to create a new sorted array, or just sort the current array.
     * Use Arrays.toString() method to print before and after sorting.
     */

    public static void main(String[] args) {
        int[] initialArray = getRandomArray(5);
        System.out.println("This is the array before sorting: " + Arrays.toString(initialArray));
        int[] copiedArray = Arrays.copyOf(initialArray, initialArray.length);

        System.out.println("This is the array after sorting: " + Arrays.toString(copiedArray));

        int[] sortedArray = sortIntegers(new int[] {7, 30, 40});
        System.out.println(Arrays.toString(sortedArray));


    }


    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(1000);
        }
        return newInt;
    }

    //create a new method for sorting
    private static int[] sortIntegers(int[] array) {

        System.out.println(Arrays.toString(array));

        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                    System.out.println("----->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("-->" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}
