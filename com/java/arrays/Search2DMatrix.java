package arrays;

//https://leetcode.com/problems/search-a-2d-matrix/description/
public class Search2DMatrix {

    public static void main(String[] args) {
        int[][] matrix = {{ 1, 3, 5, 7},
                          {10, 11, 16, 20},
                          {23, 30, 34, 60}
        };

        System.out.println(searchMatrix(matrix,16));
        System.out.println(searchMatrix(matrix,2));
    }

    static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;

        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1; // m * n

        while (left <= right) {

            int mid = left + (right - left) / 2;


            int current = matrix[mid / cols][mid % cols];

            if (current == target) return true;
            if (current < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        return false;
    }
}

