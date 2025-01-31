package example;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/contains-duplicate
public class ContainsDuplicate {


    public static void main(String[] args){

        int[] nums = {1,2,3,4,5,6};

        boolean containsDuplicate = containsDuplicate(nums);

        System.out.println(containsDuplicate);
    }

    public static boolean containsDuplicate(int[] nums) {
 
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            if (set.contains(num)){
                return true;
            }else{
                set.add(num);
            }
        }

        return false;
    }
}