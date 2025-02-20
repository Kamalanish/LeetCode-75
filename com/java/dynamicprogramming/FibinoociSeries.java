package dynamicprogramming;

import java.util.Arrays;

public class FibinoociSeries {
    public static void main(String[] args) {
        int n = 5;
        long[] memo = new long[n + 1];
        Arrays.fill(memo, -1);
        System.out.println(fibinooci(n, memo));
    }

    private static long fibinooci(long n, long[] memo) {

        if (n <= 1)
            return n;

        if (memo[(int) n] != -1) {
            return memo[(int) n];
        }
        long result = fibinooci(n - 1, memo) + fibinooci(n - 2, memo);
        memo[(int) n] = result;
        return result;
    }
}
