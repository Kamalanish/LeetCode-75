package example;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};

        System.out.println(optimized(nums));
        bruteForce(nums);
        better(nums);
    }

    static void bruteForce(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start; end < nums.length; end++) {
                int subSum = 0;
                for (int i = start; i <= end; i++) {
                    subSum += nums[i];
                    maxSum = Math.max(maxSum, subSum);
                }
            }
        }

        System.out.println(maxSum);
    }

    static void better(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < nums.length; start++) {
            int subSum = 0;
            for (int end = start; end < nums.length; end++) {

                subSum += nums[end];
                maxSum = Math.max(maxSum, subSum);
            }
        }

        System.out.println(maxSum);
    }

    public static int optimized(int[] nums) {

        int currentSum = 0;

        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {

            int temp = num + currentSum;

            currentSum = Math.max(temp, num);

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
