//https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75
public class ReverseVowels {

    public static void main(String[] args) {

        String case1 = reverseVowels("IceCreAm");
        System.out.println(case1);
        String case2 = reverseVowels("leetcode");
        System.out.println(case2);
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();

        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (isVowel(chars[start]) && isVowel(chars[end])) {
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            } else if (!isVowel(chars[start])) {
                start++;
            } else if (!isVowel(chars[end])) {
                end--;
            }
        }
        return new String(chars);

    }

    static boolean isVowel(char input) {
        String vowels = "aeiouAEIOU";

        return vowels.indexOf(input) != -1;

    }
}
