package arrays;

public class BalancedArrayOrNot {


    public static void main(String[] args) {
        int[] array1 = {-9, -6, 6, 9};
        int[] array2 = {-9, -6, 9, 1, 6};

        System.out.println("Array1 is balanced: " + isBalanced(array1)); // Output: true
        System.out.println("Array2 is balanced: " + isBalanced(array2)); // Output: false
    }

    public static boolean isBalanced(int[] arr) {
        int positiveSum = 0;
        int negativeSum = 0;
        for (int num : arr) {
            if (num < 0) {
                negativeSum += num;
            } else if (num > 0) {
                positiveSum += num;
            }
        }

        return Math.abs(negativeSum) == positiveSum;
    }
}
