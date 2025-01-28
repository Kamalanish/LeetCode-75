// https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversewordInString {

    public static void main(String[] args) {
        String case1 = reverseWords("the sky is blue");
        System.out.println(case1);
        String case2 = reverseWords("  hello world  ");
        System.out.println(case2);
    }

    public static String reverseWords(String s) {
        List<String> list = Arrays.asList(s.trim().split("\\s+"));

        Collections.reverse(list);

        return String.join(" ", list);
    }
}
