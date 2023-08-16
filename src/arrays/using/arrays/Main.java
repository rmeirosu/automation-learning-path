package arrays.using.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        //sort the values of the array
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        //array is initialised with value 0 in all elements
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));
        //array is filled with value 5

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourtArray = Arrays.copyOf(thirdArray, thirdArray.length);
        //make a copy of the third array
        System.out.println(Arrays.toString(fourtArray));

        Arrays.sort(fourtArray);
        System.out.println(Arrays.toString(thirdArray));
        //original array is unchanged
        System.out.println(Arrays.toString(fourtArray));
        //fourth array is sorted

        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallerArray));
        //only the first 5 elements of thirdArray are copied in smallerArray

        int[] largeArray = Arrays.copyOf(thirdArray, 15);
        System.out.println(Arrays.toString(largeArray));
        //first 10 elements are copied over from thirdArray, last 5 elements are initialised by default to 0

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5, 0};
        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal.");
        } else {
            System.out.println("Arrays are not equal.");
        }


    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }



}
