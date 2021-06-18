package by.andervyd.work_with_data.sort;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int begin, int end, int... arr) {
        if (begin < end) {
            int partitionIndex = partition(begin, end, arr);

            quickSort(begin, partitionIndex - 1, arr);
            quickSort(partitionIndex + 1, end, arr);
        }
    }

    private static int partition(int begin, int end, int... arr) {
        int pivot = arr[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {3, 1, 4, -6, 0, 9, -2};

        quickSort(0, arr.length - 1, arr);
        System.out.println(Arrays.toString(arr));
    }
}
