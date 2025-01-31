package example;

import java.util.Arrays;

//https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductOfArryExpectSelf {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int prefix = 1;
        int post = 1;

        int[] result = new int[n];

        Arrays.fill(result, 1);

        for(int i=0; i<n; i++){
            result[i] = result[i] * prefix;
            prefix = nums[i] * prefix;
        }

        for(int i=n-1; i>=0; i--){
            result[i] = result[i]* post;
            post = nums[i]*post;
        }
        return result;
    }
}
