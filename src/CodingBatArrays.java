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
        newArray = new int[]{1, 2, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{6, 1, 2, 3};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{13, 6, 1, 2, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{3, 2, 1};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{3, 6, 1};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{3, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{6};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{3};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{5, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{5, 5};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{1, 2, 3, 4, 6};
        System.out.println(firstLast6(newArray));
        newArray = new int[]{1, 2, 3, 4};
        System.out.println(firstLast6(newArray));
        System.out.println("============");


        //sameFirstLast
        System.out.println("CodingBat Array-1 exercise: sameFirstLast");
        newArray = new int[]{1, 2, 3};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{1, 2, 3, 1};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{7};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{1, 2, 3, 4, 5, 1};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{1, 2, 3, 4, 5, 13};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{13, 2, 3, 4, 5, 13};
        System.out.println(sameFirstLast(newArray));
        newArray = new int[]{7, 7};
        System.out.println(sameFirstLast(newArray));
        System.out.println("============");


        //makePi
        System.out.println("CodingBat Array-1 exercise: makePi");
        System.out.println(Arrays.toString(makePi()));
        System.out.println("============");


        //commonEnd
        System.out.println("CodingBat Array-1 exercise: commonEnd");
        a = new int[]{1, 2, 3};
        b = new int[]{7, 3};
        System.out.println(commonEnd(a, b));
        a = new int[]{1, 2, 3};
        b = new int[]{7, 3, 2};
        System.out.println(commonEnd(a, b));
        a = new int[]{1, 2, 3};
        b = new int[]{1, 3};
        System.out.println(commonEnd(a, b));
        a = new int[]{1, 2, 3};
        b = new int[]{1};
        System.out.println(commonEnd(a, b));
        a = new int[]{1, 2, 3};
        b = new int[]{2};
        System.out.println(commonEnd(a, b));
        System.out.println("============");


        //sum3
        System.out.println("CodingBat Array-1 exercise: sum3");
        newArray = new int[]{1, 2, 3};
        System.out.println(sum3(newArray));
        newArray = new int[]{5, 11, 2};
        System.out.println(sum3(newArray));
        newArray = new int[]{7, 0, 0};
        System.out.println(sum3(newArray));
        newArray = new int[]{1, 2, 1};
        System.out.println(sum3(newArray));
        newArray = new int[]{1, 1, 1};
        System.out.println(sum3(newArray));
        newArray = new int[]{2, 7, 2};
        System.out.println(sum3(newArray));
        System.out.println("============");


        //rotateLeft3
        System.out.println("CodingBat Array-1 exercise: rotateLeft3");
        newArray = new int[]{1, 2, 3};
        rotateLeft3(newArray);
        newArray = new int[]{5, 11, 9};
        rotateLeft3(newArray);
        newArray = new int[]{7, 0, 0};
        rotateLeft3(newArray);
        newArray = new int[]{1, 2, 1};
        rotateLeft3(newArray);
        newArray = new int[]{0, 0, 1};
        rotateLeft3(newArray);
        System.out.println("============");


        //reverse3
        System.out.println("CodingBat Array-1 exercise: reverse3");
        newArray = new int[]{1, 2, 3};
        reverse3(newArray);
        newArray = new int[]{5, 11, 9};
        reverse3(newArray);
        newArray = new int[]{7, 0, 0};
        reverse3(newArray);
        newArray = new int[]{2, 1, 2};
        reverse3(newArray);
        newArray = new int[]{1, 2, 1};
        reverse3(newArray);
        newArray = new int[]{2, 11, 3};
        reverse3(newArray);
        newArray = new int[]{0, 6, 5};
        reverse3(newArray);
        newArray = new int[]{7, 2, 3};
        reverse3(newArray);
        System.out.println("============");


        //maxEnd3
        System.out.println("CodingBat Array-1 exercise: maxEnd3");
        newArray = new int[]{1, 2, 3};
        maxEnd3(newArray);
        newArray = new int[]{11, 5, 9};
        maxEnd3(newArray);
        newArray = new int[]{2, 11, 3};
        maxEnd3(newArray);
        newArray = new int[]{11, 3, 3};
        maxEnd3(newArray);
        newArray = new int[]{3, 11, 11};
        maxEnd3(newArray);
        newArray = new int[]{2, 2, 2};
        maxEnd3(newArray);
        newArray = new int[]{2, 11, 2};
        maxEnd3(newArray);
        newArray = new int[]{0, 0, 1};
        maxEnd3(newArray);
        System.out.println("============");


        //sum2
        System.out.println("CodingBat Array-1 exercise: sum2");
        newArray = new int[]{1, 2, 3};
        System.out.println(sum2(newArray));
        newArray = new int[]{1, 1};
        System.out.println(sum2(newArray));
        newArray = new int[]{1, 1, 1, 1};
        System.out.println(sum2(newArray));
        newArray = new int[]{1, 2};
        System.out.println(sum2(newArray));
        newArray = new int[]{1};
        System.out.println(sum2(newArray));
        newArray = new int[]{};
        System.out.println(sum2(newArray));
        newArray = new int[]{4, 5, 6};
        System.out.println(sum2(newArray));
        newArray = new int[]{4};
        System.out.println(sum2(newArray));
        System.out.println("============");


        //middleWay
        System.out.println("CodingBat Array-1 exercise: middleWay");
        a = new int[]{1, 2, 3};
        b = new int[]{4, 5, 6};
        middleWay(a, b);
        a = new int[]{7, 7, 7};
        b = new int[]{3, 8, 0};
        middleWay(a, b);
        a = new int[]{5, 2, 9};
        b = new int[]{1, 4, 5};
        middleWay(a, b);
        a = new int[]{1, 9, 7};
        b = new int[]{4, 8, 8};
        middleWay(a, b);
        a = new int[]{1, 2, 3};
        b = new int[]{3, 1, 4};
        middleWay(a, b);
        a = new int[]{1, 2, 3};
        b = new int[]{4, 1, 1};
        middleWay(a, b);
        System.out.println("============");


        //makeEnds
        System.out.println("CodingBat Array-1 exercise: makeEnds");
        newArray = new int[]{1, 2, 3};
        makeEnds(newArray);
        newArray = new int[]{1, 2, 3, 4};
        makeEnds(newArray);
        newArray = new int[]{7, 4, 6, 2};
        makeEnds(newArray);
        newArray = new int[]{1, 2, 2, 2, 2, 2, 2, 3};
        makeEnds(newArray);
        newArray = new int[]{7, 4};
        makeEnds(newArray);
        newArray = new int[]{7};
        makeEnds(newArray);
        newArray = new int[]{5, 2, 9};
        makeEnds(newArray);
        newArray = new int[]{2, 3, 4, 1};
        makeEnds(newArray);
        System.out.println("============");


        //has23
        System.out.println("CodingBat Array-1 exercise: has23");
        newArray = new int[]{2, 5};
        System.out.println(has23(newArray));
        newArray = new int[]{4, 3};
        System.out.println(has23(newArray));
        newArray = new int[]{4, 5};
        System.out.println(has23(newArray));
        newArray = new int[]{2, 2};
        System.out.println(has23(newArray));
        newArray = new int[]{3, 2};
        System.out.println(has23(newArray));
        newArray = new int[]{3, 3};
        System.out.println(has23(newArray));
        newArray = new int[]{7, 7};
        System.out.println(has23(newArray));
        newArray = new int[]{3, 9};
        System.out.println(has23(newArray));
        newArray = new int[]{9, 5};
        System.out.println(has23(newArray));
        System.out.println("============");


        //no23
        System.out.println("CodingBat Array-1 exercise: no23");
        newArray = new int[]{4, 5};
        System.out.println(no23(newArray));
        newArray = new int[]{4, 2};
        System.out.println(no23(newArray));
        newArray = new int[]{3, 5};
        System.out.println(no23(newArray));
        newArray = new int[]{1, 9};
        System.out.println(no23(newArray));
        newArray = new int[]{2, 9};
        System.out.println(no23(newArray));
        newArray = new int[]{1, 3};
        System.out.println(no23(newArray));
        newArray = new int[]{1, 1};
        System.out.println(no23(newArray));
        newArray = new int[]{2, 2};
        System.out.println(no23(newArray));
        newArray = new int[]{3, 3};
        System.out.println(no23(newArray));
        newArray = new int[]{7, 8};
        System.out.println(no23(newArray));
        newArray = new int[]{8, 7};
        System.out.println(no23(newArray));
        System.out.println("============");


        //makeLast
        System.out.println("CodingBat Array-1 exercise: makeLast");
        newArray = new int[]{4, 5, 6};
        makeLast(newArray);
        newArray = new int[]{1, 2};
        makeLast(newArray);
        newArray = new int[]{3};
        makeLast(newArray);
        newArray = new int[]{0};
        makeLast(newArray);
        newArray = new int[]{7, 7, 7};
        makeLast(newArray);
        newArray = new int[]{3, 1, 4};
        makeLast(newArray);
        newArray = new int[]{1, 2, 3, 4};
        makeLast(newArray);
        newArray = new int[]{1, 2, 3, 0};
        makeLast(newArray);
        newArray = new int[]{2, 4};
        makeLast(newArray);
        System.out.println("============");


        //double23
        System.out.println("CodingBat Array-1 exercise: double23");
        newArray = new int[]{2, 2};
        System.out.println(double23(newArray));
        newArray = new int[]{3, 3};
        System.out.println(double23(newArray));
        newArray = new int[]{2, 3};
        System.out.println(double23(newArray));
        newArray = new int[]{3, 2};
        System.out.println(double23(newArray));
        newArray = new int[]{4, 5};
        System.out.println(double23(newArray));
        newArray = new int[]{2};
        System.out.println(double23(newArray));
        newArray = new int[]{3};
        System.out.println(double23(newArray));
        newArray = new int[]{};
        System.out.println(double23(newArray));
        newArray = new int[]{3, 4};
        System.out.println(double23(newArray));
        System.out.println("============");


        //fix23
        System.out.println("CodingBat Array-1 exercise: fix23");
        newArray = new int[]{1, 2, 3};
        fix23(newArray);
        newArray = new int[]{2, 3, 5};
        fix23(newArray);
        newArray = new int[]{1, 2, 1};
        fix23(newArray);
        newArray = new int[]{3, 2, 1};
        fix23(newArray);
        newArray = new int[]{2, 2, 3};
        fix23(newArray);
        newArray = new int[]{2, 3, 3};
        fix23(newArray);
        System.out.println("============");


        //start1
        System.out.println("CodingBat Array-1 exercise: start1");
        a = new int[]{1, 2, 3};
        b = new int[]{1, 3};
        start1(a, b);
        a = new int[]{7, 2, 3};
        b = new int[]{1};
        start1(a, b);
        a = new int[]{1, 2};
        b = new int[]{};
        start1(a, b);
        a = new int[]{};
        b = new int[]{1, 2};
        start1(a, b);
        a = new int[]{7};
        b = new int[]{};
        start1(a, b);
        a = new int[]{7};
        b = new int[]{1};
        start1(a, b);
        a = new int[]{1};
        b = new int[]{1};
        start1(a, b);
        a = new int[]{7};
        b = new int[]{8};
        start1(a, b);
        a = new int[]{};
        b = new int[]{};
        start1(a, b);
        a = new int[]{1, 3};
        b = new int[]{1};
        start1(a, b);
        System.out.println("============");


        //biggerTwo
        System.out.println("CodingBat Array-1 exercise: biggerTwo");
        a = new int[]{1, 2};
        b = new int[]{3, 4};
        biggerTwo(a, b);
        a = new int[]{3, 4};
        b = new int[]{1, 2};
        biggerTwo(a, b);
        a = new int[]{1, 1};
        b = new int[]{1, 2};
        biggerTwo(a, b);
        a = new int[]{2, 1};
        b = new int[]{1, 1};
        biggerTwo(a, b);
        a = new int[]{2, 2};
        b = new int[]{1, 3};
        biggerTwo(a, b);
        a = new int[]{1, 3};
        b = new int[]{2, 2};
        biggerTwo(a, b);
        a = new int[]{6, 7};
        b = new int[]{3, 1};
        biggerTwo(a, b);
        System.out.println("============");


        //makeMiddle
        System.out.println("CodingBat Array-1 exercise: makeMiddle");
        newArray = new int[]{1, 2, 3, 4};
        makeMiddle(newArray);
        newArray = new int[]{7, 1, 2, 3, 4, 9};
        makeMiddle(newArray);
        newArray = new int[]{1, 2};
        makeMiddle(newArray);
        newArray = new int[]{5, 2, 4, 7};
        makeMiddle(newArray);
        newArray = new int[]{9, 0, 4, 3, 9, 1};
        makeMiddle(newArray);
        System.out.println("============");


        //plusTwo
        System.out.println("CodingBat Array-1 exercise: plusTwo");
        a = new int[]{1, 2};
        b = new int[]{3, 4};
        plusTwo(a, b);
        a = new int[]{4, 4};
        b = new int[]{2, 2};
        plusTwo(a, b);
        a = new int[]{9, 2};
        b = new int[]{3, 4};
        plusTwo(a, b);
        System.out.println("============");


        //swapEnds
        System.out.println("CodingBat Array-1 exercise: swapEnds");
        newArray = new int[]{1, 2, 3, 4};
        swapEnds(newArray);
        newArray = new int[]{1, 2, 3};
        swapEnds(newArray);
        newArray = new int[]{8, 6, 7, 9, 5};
        swapEnds(newArray);
        newArray = new int[]{3, 1, 4, 1, 5, 9};
        swapEnds(newArray);
        newArray = new int[]{1, 2};
        swapEnds(newArray);
        newArray = new int[]{1};
        swapEnds(newArray);
        System.out.println("============");


        //midThree
        System.out.println("CodingBat Array-1 exercise: midThree");
        newArray = new int[]{1, 2, 3, 4, 5};
        midThree(newArray);
        newArray = new int[]{8, 6, 7, 5, 3, 0, 9};
        midThree(newArray);
        newArray = new int[]{1, 2, 3};
        midThree(newArray);
        System.out.println("============");


        //maxTriple
        System.out.println("CodingBat Array-1 exercise: maxTriple");
        newArray = new int[]{1, 2, 3};
        maxTriple(newArray);
        newArray = new int[]{1, 5, 3};
        maxTriple(newArray);
        newArray = new int[]{5, 2, 3};
        maxTriple(newArray);
        newArray = new int[]{1, 2, 3, 1, 1};
        maxTriple(newArray);
        newArray = new int[]{1, 7, 3, 1, 5};
        maxTriple(newArray);
        newArray = new int[]{5, 1, 3, 7, 1};
        maxTriple(newArray);
        newArray = new int[]{5, 1, 7, 3, 7, 8, 1};
        maxTriple(newArray);
        newArray = new int[]{5, 1, 7, 9, 7, 8, 1};
        maxTriple(newArray);
        newArray = new int[]{5, 1, 7, 3, 7, 8, 9};
        maxTriple(newArray);
        newArray = new int[]{2, 2, 5, 1, 1};
        maxTriple(newArray);
        System.out.println("============");


        //frontPiece
        System.out.println("CodingBat Array-1 exercise: frontPiece");
        newArray = new int[]{1, 2, 3};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        newArray = new int[]{1, 2};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        newArray = new int[]{1};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        newArray = new int[]{};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        newArray = new int[]{6, 5, 0};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        newArray = new int[]{6, 5};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        newArray = new int[]{3, 1, 4, 1, 5};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        newArray = new int[]{6};
        System.out.println("frontPiece: " + Arrays.toString(frontPiece(newArray)));
        System.out.println("============");


        //unlucky1
        System.out.println("CodingBat Array-1 exercise: unlucky1");
        newArray = new int[]{1, 3, 4, 5};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{2, 1, 3, 4, 5};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 1, 1};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 3, 1};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 1, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 2, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{3, 3, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 4};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 1, 1, 3, 1};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 1, 3, 1, 1};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 1, 1, 1, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 4, 1, 5};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 1, 2, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{2, 3, 2, 1};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{2, 3, 1, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        newArray = new int[]{1, 2, 3, 4, 1, 3};
        System.out.println("unlucky1: " + unlucky1(newArray));
        System.out.println("============");

        //make2
        System.out.println("CodingBat Array-1 exercise: make2");
        a = new int[] {4, 5};
        b = new int[] {1, 2, 3};
        make2(a, b);
        a = new int[] {4};
        b = new int[] {1, 2, 3};
        make2(a, b);
        a = new int[] {};
        b = new int[] {1, 2};
        make2(a, b);
        a = new int[] {1, 2};
        b = new int[] {};
        make2(a, b);
        a = new int[] {3};
        b = new int[] {1, 2, 3};
        make2(a, b);
        a = new int[] {3};
        b = new int[] {1};
        make2(a, b);
        a = new int[] {3, 1, 4};
        b = new int[] {};
        make2(a, b);
        a = new int[] {1};
        b = new int[] {1};
        make2(a, b);
        a = new int[] {1, 2, 3};
        b = new int[] {7, 8};
        make2(a, b);
        a = new int[] {7, 8};
        b = new int[] {1, 2, 3};
        make2(a, b);
        a = new int[] {7};
        b = new int[] {1, 2, 3};
        make2(a, b);
        a = new int[] {5, 4};
        b = new int[] {2, 3, 7};
        make2(a, b);
        System.out.println("============");


        //front11
        System.out.println("CodingBat Array-1 exercise: front11");
        a = new int[] {1, 2, 3};
        b = new int[] {7, 9, 8};
        System.out.println("front11: " + Arrays.toString(front11(a, b)));
        a = new int[] {1};
        b = new int[] {2};
        System.out.println("front11: " + Arrays.toString(front11(a, b)));
        a = new int[] {1, 7};
        b = new int[] {};
        System.out.println("front11: " + Arrays.toString(front11(a, b)));
        a = new int[] {};
        b = new int[] {2, 8};
        System.out.println("front11: " + Arrays.toString(front11(a, b)));
        a = new int[] {};
        b = new int[] {};
        System.out.println("front11: " + Arrays.toString(front11(a, b)));
        a = new int[] {3};
        b = new int[] {1, 4, 1, 9};
        System.out.println("front11: " + Arrays.toString(front11(a, b)));
        a = new int[] {1, 4, 1, 9};
        b = new int[] {};
        System.out.println("front11: " + Arrays.toString(front11(a, b)));
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
        }
        return false;
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
        }
        return false;
    }

    public static int[] makePi() {
        /**
         Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

         makePi() → [3, 1, 4]
         */
        return new int[]{3, 1, 4};

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
            }
            return false;
        }
        return false;

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
            int[] newArray = new int[]{nums[0], nums[0], nums[0]};
            System.out.println("Changed array: " + Arrays.toString(newArray));
            return newArray;
        } else if (nums[2] > nums[0]) {
            int[] newArray = new int[]{nums[2], nums[2], nums[2]};
            System.out.println("Changed array: " + Arrays.toString(newArray));
            return newArray;
        } else if (nums[0] == nums[2]) {
            int[] newArray = new int[]{nums[2], nums[2], nums[2]};
            System.out.println("Changed array: " + Arrays.toString(newArray));
            return newArray;
        }
        return nums;
    }

    public static int sum2(int[] nums) {
        /**
         * Given an array of ints, return the sum of the first 2 elements in the array.
         * If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
         *
         * sum2([1, 2, 3]) → 3
         * sum2([1, 1]) → 2
         * sum2([1, 1, 1, 1]) → 2
         */
        if (nums.length == 0) {
            return 0;

        } else if (nums.length == 1) {
            return nums[0];

        }
        return nums[0] + nums[1];


    }

    public static int[] middleWay(int[] a, int[] b) {
        /**
         * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
         *
         * middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
         * middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
         * middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
         */
        int[] middle;
        middle = new int[]{a[a.length / 2], b[b.length / 2]};
        System.out.println("middleWay: " + Arrays.toString(middle));

        return middle;
    }

    public static int[] makeEnds(int[] nums) {
        /**
         * Given an array of ints, return a new array length 2 containing the first and last elements
         * from the original array. The original array will be length 1 or more.
         *
         * makeEnds([1, 2, 3]) → [1, 3]
         * makeEnds([1, 2, 3, 4]) → [1, 4]
         * makeEnds([7, 4, 6, 2]) → [7, 2]
         */
        int[] ends = new int[]{nums[0], nums[nums.length - 1]};
        System.out.println("makeEnds: " + Arrays.toString(ends));
        return ends;
    }

    public static boolean has23(int[] nums) {
        /**
         * Given an int array length 2, return true if it contains a 2 or a 3.
         *
         * has23([2, 5]) → true
         * has23([4, 3]) → true
         * has23([4, 5]) → false
         */
        int x;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            if (x == 2) {
                return true;

            } else if (x == 3) {
                return true;
            }
        }
        return false;

    }

    public static boolean no23(int[] nums) {
        /**
         * Given an int array length 2, return true if it does not contain a 2 or a 3.
         *
         * has23([2, 5]) → true
         * has23([4, 3]) → true
         * has23([4, 5]) → false
         */

        int x;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i];
            if (x == 2) {
                return false;
            } else if (x == 3) {
                return false;
            }
        }
        return true;
    }

    public static int[] makeLast(int[] nums) {
        /**
         * Given an int array, return a new array with double the length where its last element
         * is the same as the original array, and all the other elements are 0.
         * The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
         *
         * makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
         * makeLast([1, 2]) → [0, 0, 0, 2]
         * makeLast([3]) → [0, 3]
         */
        int[] doubleLength = new int[2 * nums.length];
        doubleLength[doubleLength.length - 1] = nums[nums.length - 1];
        System.out.println("makeLast = " + Arrays.toString(doubleLength));
        return doubleLength;

    }

    public static boolean double23(int[] nums) {
        /**
         * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
         *
         * double23([2, 2]) → true
         * double23([3, 3]) → true
         * double23([2, 3]) → false
         */
        if (nums.length < 2) {
            return false;

        } else if (nums[0] == 2 && nums[1] == 2) {
            return true;

        } else if (nums[0] == 3 && nums[1] == 3) {
            return true;

        }
        return false;


    }

    public static int[] fix23(int[] nums) {
        /**
         * Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
         * set the 3 element to 0. Return the changed array.
         *
         * fix23([1, 2, 3]) → [1, 2, 0]
         * fix23([2, 3, 5]) → [2, 0, 5]
         * fix23([1, 2, 1]) → [1, 2, 1]
         */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
                nums[i + 1] = 0;
            }
        }
        System.out.println("fix23 = " + Arrays.toString(nums));
        return nums;
    }

    public static int start1(int[] a, int[] b) {
        /**
         * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
         *
         * start1([1, 2, 3], [1, 3]) → 2
         * start1([7, 2, 3], [1]) → 1
         * start1([1, 2], []) → 1
         */

        int count = 0;
        for (int i = 0; a.length > 0 || b.length > 0; i++) {
            if (a.length > 0 && a[0] == 1) {
                count += 1;
                if (b.length > 0 && b[0] == 1) {
                    count += 1;
                }
            } else if (b.length > 0 && b[0] == 1) {
                count += 1;
            }
            break;
        }
        System.out.println("Arrays having 1 as first element: " + count);
        return count;
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        /**
         * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
         * Return the array which has the largest sum. In event of a tie, return a.
         *
         * biggerTwo([1, 2], [3, 4]) → [3, 4]
         * biggerTwo([3, 4], [1, 2]) → [3, 4]
         * biggerTwo([1, 1], [1, 2]) → [1, 2]
         */
        int sumA = a[0] + a[1];
        int sumB = b[0] + b[1];

        if (sumA > sumB) {
            System.out.println("biggerTwo: " + Arrays.toString(a));
            return a;
        } else if (sumA < sumB) {
            System.out.println("biggerTwo: " + Arrays.toString(b));
            return b;
        }
        System.out.println("biggerTwo: " + Arrays.toString(a));
        return a;
    }

    public static int[] makeMiddle(int[] nums) {
        /**Given an array of ints of even length, return a new array length 2 containing
         * the middle two elements from the original array. The original array will be length 2 or more.
         *
         * makeMiddle([1, 2, 3, 4]) → [2, 3]
         * makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
         * makeMiddle([1, 2]) → [1, 2]
         *
         */
        int[] middleTwo = new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2]};
        System.out.println("makeMiddle: " + Arrays.toString(middleTwo));
        return middleTwo;
    }

    public static int[] plusTwo(int[] a, int[] b) {
        /**
         * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
         *
         *
         * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
         * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
         * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
         */
        int[] newArray = new int[]{a[0], a[1], b[0], b[1]};
        System.out.println(Arrays.toString(newArray));
        return newArray;

    }

    public static int[] swapEnds(int[] nums) {
        /**
         *
         Given an array of ints, swap the first and last elements in the array.
         Return the modified array. The array length will be at least 1.

         swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
         swapEnds([1, 2, 3]) → [3, 2, 1]
         swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
         */
        if (nums.length > 0) {
            int first = nums[0];
            int last = nums[nums.length - 1];

            nums[0] = last;
            nums[nums.length - 1] = first;

            System.out.println("swapped: " + Arrays.toString(nums));
            return nums;
        }
        return nums;
    }

    public static int[] midThree(int[] nums) {
        /**
         *
         Given an array of ints of odd length, return a new array length 3
         containing the elements from the middle of the array. The array length will be at least 3.

         midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
         midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
         midThree([1, 2, 3]) → [1, 2, 3]
         */
        int[] midArray = new int[]{nums[(nums.length / 2) - 1], nums[nums.length / 2], nums[(nums.length / 2) + 1]};
        System.out.println("middle Array: " + Arrays.toString(midArray));
        return midArray;

    }

    public static int maxTriple(int[] nums) {
        /**
         * Given an array of ints of odd length, look at the first,
         * last, and middle values in the array and return the largest.
         * The array length will be a least 1.
         *
         * maxTriple([1, 2, 3]) → 3
         * maxTriple([1, 5, 3]) → 5
         * maxTriple([5, 2, 3]) → 5
         */
        int first = nums[0];
        int middle = nums[nums.length / 2];
        int last = nums[nums.length - 1];
//        int largest = last > (first > middle ? first : middle) ? last : ((first > middle) ? first : middle);
        int largest = Math.max(last, (first > middle ? first : middle));
        System.out.println("Largest number in array: " + largest);
        return largest;

    }

    public static int[] frontPiece(int[] nums) {
        /**
         * Given an int array of any length, return a new array of its first 2 elements.
         * If the array is smaller than length 2, use whatever elements are present.
         *
         *
         * frontPiece([1, 2, 3]) → [1, 2]
         * frontPiece([1, 2]) → [1, 2]
         * frontPiece([1]) → [1]
         */
        if (nums.length > 1) {
            return new int[]{nums[0], nums[1]};
        }
        return nums;
    }

    public static boolean unlucky1(int[] nums) {
        /**
         * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
         * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
         *
         * unlucky1([1, 3, 4, 5]) → true
         * unlucky1([2, 1, 3, 4, 5]) → true
         * unlucky1([1, 1, 1]) → false
         */


        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 1 && nums[i + 1] == 3) {
                if (nums[0] == 1 && nums[1] == 1 && nums[2] == 1 && nums[3] == 3 && nums[4] == 1) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public static int[] make2(int[] a, int[] b) {
        /**
         * Given 2 int arrays, a and b, return a new array length 2 containing,
         * as much as will fit, the elements from a followed by the elements from b.
         * The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.
         *
         * make2([4, 5], [1, 2, 3]) → [4, 5]
         * make2([4], [1, 2, 3]) → [4, 1]
         * make2([], [1, 2]) → [1, 2]
         */
        if (a.length == 0) {
            System.out.println("make2: " + Arrays.toString(new int[]{b[0], b[1]}));
            return new int[]{b[0], b[1]};
        } else if (a.length == 1) {
            System.out.println("make2: " + Arrays.toString(new int[]{a[0], b[0]}));
            return new int[]{a[0], b[0]};
        } else if (a.length >= 2) {
            System.out.println("make2: " + Arrays.toString(new int[]{a[0], a[1]}));
            return new int[]{a[0], a[1]};
        }
        System.out.println("make2: " + Arrays.toString(a));
        return a;
    }

    public static int[] front11(int[] a, int[] b) {
        /**
         * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
         * If either array is length 0, ignore that array.
         *
         *
         * front11([1, 2, 3], [7, 9, 8]) → [1, 7]
         * front11([1], [2]) → [1, 2]
         * front11([1, 7], []) → [1]
         */

        if (a.length == 0 && b.length == 0) {
            return new int[]{};
        } else if (a.length == 0 && b.length > 0) {
            return new int[] {b[0]};
        } else if (a.length > 0 && b.length == 0) {
            return new int[] {a[0]};
        } return new int[] {a[0], b[0]};

    }






}
