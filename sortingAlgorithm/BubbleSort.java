package sortingAlgorithm;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args){

        int[] arr = {9,3,5,2,4,7,1,8,6};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr){
        boolean flag = true;
        for(int i=0; i<arr.length-1 && flag; i++){
            flag = false;
            for(int j=1; j< arr.length-i; j++){
                if(arr[j-1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    flag = true;
                }
            }
        }
    }
}
