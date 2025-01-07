package searchAlgorithm;

public class OrderAgnosticBS {
    static int agnosticBS(int[] nums, int start, int end, int target) {
        boolean ascend = nums[start] < nums[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }

            if (ascend) {
                if (nums[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else if (nums[mid] > target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 6, 12, 18, 25, 29, 35, 48, 50, 59, 66};
        int target = 6;
        int[] nums1 = new int[]{35, 45, 22, 21, 15, 11, 8, 6, 3, 2, 1};
        int target1 = 6;
        System.out.println(agnosticBS(nums, 0, nums.length - 1, target));
        System.out.println(agnosticBS(nums1, 0, nums1.length - 1, target1));
    }

}
