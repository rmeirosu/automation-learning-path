import java.lang.reflect.Array;
import java.util.Arrays;

//Exercises from CodingBat website - Array-1
public class CodingBatArrays {

    public static void main(String[] args) {

        int[] newArray;
        int[] a;
        int[] b;

        //firstLast6
        System.out.println("CodingBat Array-1 exercise: firstLast6");
        newArray = new int[] {1, 2, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {6, 1, 2, 3};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {13, 6, 1, 2, 3};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {13, 6, 1, 2, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {3, 2, 1};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {3, 6, 1};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {3, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {6};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {3};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {5, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {5, 5};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {1, 2, 3, 4, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[] {1, 2, 3, 4};
        System.out.println(firstLast6(newArray));
        System.out.println("============");


        //sameFirstLast
        System.out.println("CodingBat Array-1 exercise: sameFirstLast");
        newArray = new int[] {1, 2, 3};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {1, 2, 3, 1};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {1, 2, 1};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {7};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {1, 2, 3, 4, 5, 1};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {1, 2, 3, 4, 5, 13};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {13, 2, 3, 4, 5, 13};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[] {7, 7};
        System.out.println(sameFirstLast(newArray));
        System.out.println("============");


        //makePi
        System.out.println("CodingBat Array-1 exercise: makePi");
        System.out.println(Arrays.toString(makePi()));
        System.out.println("============");


        //commonEnd
        System.out.println("CodingBat Array-1 exercise: commonEnd");
        a = new int[] {1, 2, 3}; b = new int[] {7, 3};
        System.out.println(commonEnd(a, b));
        a = new int[] {1, 2, 3}; b = new int[] {7, 3, 2};
        System.out.println(commonEnd(a, b));
        a = new int[] {1, 2, 3}; b = new int[] {1, 3};
        System.out.println(commonEnd(a, b));
        a = new int[] {1, 2, 3}; b = new int[] {1};
        System.out.println(commonEnd(a, b));
        a = new int[] {1, 2, 3}; b = new int[] {2};
        System.out.println(commonEnd(a, b));
        System.out.println("============");


        //sum3
        System.out.println("CodingBat Array-1 exercise: sum3");
        newArray = new int[] {1, 2, 3};
        System.out.println(sum3(newArray));
        newArray = new int[] {5, 11, 2};
        System.out.println(sum3(newArray));
        newArray = new int[] {7, 0, 0};
        System.out.println(sum3(newArray));
        newArray = new int[] {1, 2, 1};
        System.out.println(sum3(newArray));
        newArray = new int[] {1, 1, 1};
        System.out.println(sum3(newArray));
        newArray = new int[] {2, 7, 2};
        System.out.println(sum3(newArray));
        System.out.println("============");


        //rotateLeft3
        System.out.println("CodingBat Array-1 exercise: rotateLeft3");
        newArray = new int[] {1, 2, 3};
        rotateLeft3(newArray);
        newArray = new int[] {5, 11, 9};
        rotateLeft3(newArray);
        newArray = new int[] {7, 0, 0};
        rotateLeft3(newArray);
        newArray = new int[] {1, 2, 1};
        rotateLeft3(newArray);
        newArray = new int[] {0, 0, 1};
        rotateLeft3(newArray);
        System.out.println("============");


        //reverse3
        System.out.println("CodingBat Array-1 exercise: reverse3");
        newArray = new int[] {1, 2, 3};
        reverse3(newArray);
        newArray = new int[] {5, 11, 9};
        reverse3(newArray);
        newArray = new int[] {7, 0, 0};
        reverse3(newArray);
        newArray = new int[] {2, 1, 2};
        reverse3(newArray);
        newArray = new int[] {1, 2, 1};
        reverse3(newArray);
        newArray = new int[] {2, 11, 3};
        reverse3(newArray);
        newArray = new int[] {0, 6, 5};
        reverse3(newArray);
        newArray = new int[] {7, 2, 3};
        reverse3(newArray);
        System.out.println("============");


        //maxEnd3
        System.out.println("CodingBat Array-1 exercise: maxEnd3");
        newArray = new int[] {1, 2, 3};
        maxEnd3(newArray);
        newArray = new int[] {11, 5, 9};
        maxEnd3(newArray);
        newArray = new int[] {2, 11, 3};
        maxEnd3(newArray);
        newArray = new int[] {11, 3, 3};
        maxEnd3(newArray);
        newArray = new int[] {3, 11, 11};
        maxEnd3(newArray);
        newArray = new int[] {2, 2, 2};
        maxEnd3(newArray);
        newArray = new int[] {2, 11, 2};
        maxEnd3(newArray);
        newArray = new int[] {0, 0, 1};
        maxEnd3(newArray);
        System.out.println("============");













    }


    public static boolean firstLast6(int[] nums) {
    /**
    Given an array of ints, return true if 6 appears as either the first or last element in the array.
    The array will be length 1 or more.

    firstLast6([1, 2, 6]) → true
    firstLast6([6, 1, 2, 3]) → true
    firstLast6([13, 6, 1, 2, 3]) → false
    */
        if (nums[0] == 6 || nums[nums.length - 1] == 6) {
            return true;
        } return false;
    }

    public static boolean sameFirstLast(int[] nums) {
    /**
    Given an array of ints, return true if the array is length 1 or more,
    and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    */
        if ((nums.length >= 1) && (nums[0] == nums[nums.length - 1])) {
            return true;
        } return false;
    }

    public static int[] makePi() {
    /**
    Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

    makePi() → [3, 1, 4]
     */
        return new int[] {3, 1, 4};

    }

    public static boolean commonEnd(int[] a, int[] b) {
    /**
    Given 2 arrays of ints, a and b, return true if they have the same first element
    or they have the same last element. Both arrays will be length 1 or more.

    commonEnd([1, 2, 3], [7, 3]) → true
    commonEnd([1, 2, 3], [7, 3, 2]) → false
    commonEnd([1, 2, 3], [1, 3]) → true
     */
        if (a.length >= 1 && b.length >= 1) {
            if (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]) {
                return true;
            } return false;
        } return false;

    }

    public static int sum3(int[] nums) {
    /**
     * Given an array of ints length 3, return the sum of all the elements.
     *
     * sum3([1, 2, 3]) → 6
     * sum3([5, 11, 2]) → 18
     * sum3([7, 0, 0]) → 7
     */
    return nums[0] + nums[1] + nums[2];
    }

    public static int[] rotateLeft3(int[] nums) {
        /**
         * Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
         *
         *
         * rotateLeft3([1, 2, 3]) → [2, 3, 1]
         * rotateLeft3([5, 11, 9]) → [11, 9, 5]
         * rotateLeft3([7, 0, 0]) → [0, 0, 7]
         */
//        System.out.println("Initial array: " + Arrays.toString(nums));
        int[] rotatedArray = new int[]{nums[1], nums[2], nums[0]};
        System.out.println("Rotated array: " + Arrays.toString(rotatedArray));
        return rotatedArray;
    }

    public static int[] reverse3(int[] nums) {
        /**
         * Given an array of ints length 3, return a new array with the elements in reverse order,
         * so {1, 2, 3} becomes {3, 2, 1}.
         *
         * reverse3([1, 2, 3]) → [3, 2, 1]
         * reverse3([5, 11, 9]) → [9, 11, 5]
         * reverse3([7, 0, 0]) → [0, 0, 7]
         */
//        System.out.println("Initial array: " + Arrays.toString(nums));
        int[] reversedArray = new int[]{nums[2], nums[1], nums[0]};
        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
        return reversedArray;

    }

    public static int[] maxEnd3(int[] nums) {
    /**
     * Given an array of ints length 3, figure out which is larger,
     * the first or last element in the array, and set all the other elements to be that value.
     * Return the changed array.
     *
     * maxEnd3([1, 2, 3]) → [3, 3, 3]
     * maxEnd3([11, 5, 9]) → [11, 11, 11]
     * maxEnd3([2, 11, 3]) → [3, 3, 3]
     */
//        System.out.println("Unchanged array: " + Arrays.toString(nums));
        if (nums[0] > nums[2]) {
            int[] newArray = new int[] {nums[0], nums[0], nums[0]};
            System.out.println("Changed array: " + Arrays.toString(newArray));
            return newArray;
        } else if (nums[2] > nums[0]) {
            int[] newArray = new int[] {nums[2], nums[2], nums[2]};
            System.out.println("Changed array: " + Arrays.toString(newArray));
            return newArray;
        } else if (nums[0] == nums[2]) {
            int[] newArray = new int[] {nums[2], nums[2], nums[2]};
            System.out.println("Changed array: " + Arrays.toString(newArray));
            return newArray;
        } return nums;
    }



}
