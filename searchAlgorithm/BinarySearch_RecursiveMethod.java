package searchAlgorithm;

public class BinarySearch_RecursiveMethod {
    static int binarySearch(int[] nums, int start, int end, int target){

        if(start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                return binarySearch(nums, mid+1, end, target);
            } else {
                return binarySearch(nums, start, mid-1, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //if array is sorted
        //use binary search
        int[] nums = {3, 4, 6, 8, 9, 15, 16, 35};
        int target = 16;
        System.out.println(binarySearch(nums, 0, nums.length-1, target));
    }
}
