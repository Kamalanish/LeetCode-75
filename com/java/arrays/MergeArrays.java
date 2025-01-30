package arrays;

//Merge and Sort Arrays: Merge two arrays and sort them in ascending order.
public class MergeArrays {



    public static void main(String[] args) {
        int[] arr1 = {0,1,2,3};
        int[] arr2 = {2,5,6};
        mergeAndSort(arr1, arr2);
    }

    static int[] mergeAndSort(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] result = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }
        return result;
    }
}
