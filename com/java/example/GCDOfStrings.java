package example;

/*
https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
*/
public class GCDOfStrings {
    public static void main(String[] args) {

        System.out.println("Case 1 : "+ gcdOfStrings("ABCABC","ABC"));
        System.out.println("Case 2 : "+ gcdOfStrings("ABABAB","ABAB"));
        System.out.println("Case 3 : "+ gcdOfStrings("LEET","CODE"));
    }

    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals((str2 + str1)))
            return "";

        // Calculate GCD of the lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // The GCD string will be the prefix of str1 with length gcdLength
        return str1.substring(0, gcdLength);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
