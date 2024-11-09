import java.util.ArrayList;
import java.util.List;

/*
https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
*/
public class Question1431 {
    public static void main(String[] args) {
        System.out.println(kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3));
        System.out.println(kidsWithCandies(new int[]{4,2,1,1,2}, 1));
        System.out.println(kidsWithCandies(new int[]{12,1,12}, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        for (int candy : candies) {

            if (candy + extraCandies >= max(candies)) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }
        return result;
    }

    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}
