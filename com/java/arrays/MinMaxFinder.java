package arrays;

public class MinMaxFinder {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 8, 20, 9, 3};

        findMinMax(arr);
        findMinMaxIndices(arr);
    }

    private static void findMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }

        System.out.println("Min value : " + min);
        System.out.println("Max value : " + max);
    }

    private static void findMinMaxIndices(int[] arr) {

        int minIndex = 0;
        int maxIndex = 0;

        int minValue = arr[0];
        int maxValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];
            if (num < minValue) {
                minValue = num;
                minIndex = i;
            } else if (num > maxValue) {
                maxValue = num;
                maxIndex = i;
            }
        }

        System.out.println("Min value index : " + minIndex);
        System.out.println("Max value index : " + maxIndex);
    }
}
