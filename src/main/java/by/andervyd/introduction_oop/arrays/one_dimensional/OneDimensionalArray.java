package by.andervyd.introduction_oop.arrays.one_dimensional;

import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {

        int[] array1;
        array1 = new int[2];
        array1[0] = 1;
        array1[1] = 2;

        // or

        int[] array2 = new int[]{1,2};

        // or

        int[] array3 = {1,2};

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array3));
        // >> [1, 2]
        //    [1, 2]
        //    [1, 2]
    }
}
