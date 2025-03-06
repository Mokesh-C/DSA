package sortingAlgorithm;

import java.util.*;

public class CycleSort {
    //Note: Use cycle sort only if numbers from range 1 to N
    public static void main(String[] args) {
        int[] arr = {9, 3, 5, 2, 4, 7, 1, 8, 8,9, 6};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPos = arr[i] - 1;
            if (arr[i] != arr[correctPos]) {
                swap(arr, i, correctPos);
            }
            else{
                i++;
            }
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
