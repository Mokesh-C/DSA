package sortingAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {};
        mergeSort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (end - start <= 1) return;
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);
        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] sorted = new int[end - start];
        int s1 = start, s2 = mid, m = 0;
        while (s1 < mid && s2 < end) {
            if (arr[s1] < arr[s2]) sorted[m++] = arr[s1++];
            else sorted[m++] = arr[s2++];
        }

        while (s1 < mid) {
            sorted[m++] = arr[s1++];
        }
        while (s2 < end) {
            sorted[m++] = arr[s2++];
        }

        for (int i= 0; i < sorted.length; i++) arr[start + i] = sorted[i];

    }
}
