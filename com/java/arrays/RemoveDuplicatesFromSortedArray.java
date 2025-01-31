package arrays;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int indexForNumber = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[indexForNumber]) {
                indexForNumber++;
                nums[indexForNumber] = nums[i];
            }
        }
        return indexForNumber + 1;
    }




}
