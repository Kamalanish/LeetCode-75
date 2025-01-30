package arrays;

import java.util.Arrays;

// https://leetcode.com/problems/rotate-array/description/
public class RotateArray {


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotateArray(nums, k);
    }

    static void rotateArray(int[] arr, int k) {

        if (k == arr.length || arr.length == 0 || arr == null) {
            return;
        }

        if (k > arr.length) {
            k = k % arr.length;
        }

        int left = 0;

        int right = arr.length - 1 - k;

        int nextLeft = right + 1;

        reverseArray(arr, left, right);

        right = arr.length - 1;

        reverseArray(arr, nextLeft, right);

        left = 0;

        right = arr.length - 1;

        reverseArray(arr, left, right);

        System.out.println(Arrays.toString(arr));

    }


    static void reverseArray(int[] arr, int left, int right) {

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
