package example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 8, 9, 10};

        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }


    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> complements = new HashMap<>();
        int index = 0;
        for (int num : nums) {
            int complement = target - num;
            if (complements.containsKey(complement)) {
                return new int[]{complements.get(complement), index};
            }
            complements.put(num, index);
            index++;
        }
        return new int[]{-1, -1};
    }
}
