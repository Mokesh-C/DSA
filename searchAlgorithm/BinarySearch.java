package searchAlgorithm;

public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {3, 4, 6, 8, 9, 15, 16, 35};
        int target = 6;

        System.out.println(binarySearch(nums, 0, nums.length-1, target));
    }

    static int binarySearch(int[] nums, int start, int end, int target){

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
