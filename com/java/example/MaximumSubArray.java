package example;

public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {5,4,-1,7,8};

        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;

        int maxSum = Integer.MIN_VALUE;

        for(int num : nums){

            int temp = num+currentSum;

            if(temp < num){
                currentSum = num;
            }else{
                currentSum = temp;
            }

            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }
}
