package example;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-consecutive-sequence/description/
public class LongestConsecutiveSequence {

    public static void main(String[] args) {

        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {

        int max = 0;


        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int num : nums) {
            // check whether the following num is starting point by subtracting 1
            // If the subtracted value is present in set we will move for next element
            if (set.contains(num - 1)) continue;

            int currentLength = 0;

            while (set.contains(num)) {
                currentLength++;
                num++;
            }
            max = Math.max(max, currentLength);

        }

        return max;
    }
}
