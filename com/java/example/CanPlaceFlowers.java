package example;//https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75

public class CanPlaceFlowers {

    public static void main(String[] args) {

        int[] case1 = new int[]{1, 0, 0, 0, 1};
        int n1 = 1;
        int[] case2 = new int[]{1, 0, 0, 0, 1};
        int n2 = 2;


        System.out.println(canPlaceFlowers(case1, n1));
        System.out.println(canPlaceFlowers(case2, n2));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i = i + 2) {
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1 || flowerbed[i] == flowerbed[i + 1]) {
                    n--;
                }else {
                    i++;
                }
            }
        }

        return n <= 0;
    }
}
