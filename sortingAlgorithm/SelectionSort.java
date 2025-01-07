package sortingAlgorithm;
import java.util.*;
public class SelectionSort {
    public static void main(String[] args){

        int[] arr = {85,5,13,29,7,2,16,11,4};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int index = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }
            swap(arr, i, index);
        }
    }
    public static void swap(int[] arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
