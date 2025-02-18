package arrays;

public class SortedArrayOrNot {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {5, 3, 4, 1, 2};

        System.out.println("Array1 is sorted: " + isSorted(array1)); // Output: true
        System.out.println("Array2 is sorted: " + isSorted(array2)); // Output: false
    }

    public static boolean isSorted(int[] array) {
        if (array == null || array.length <= 1) {
            return true; // An empty array or single-element array is considered sorted
        }

        for (int i = 0; i < array.length - 1; i++) {

            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }
}
