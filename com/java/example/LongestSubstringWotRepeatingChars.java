package example;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstringWotRepeatingChars {

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {

        int start = 0;
        int end = 0;

        int maxLen = Math.min(s.length(), 1);

        Set<Character> seen = new HashSet<>();

        while (end < s.length()) {
            char c = s.charAt(end);

            while (seen.contains(c)) {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(c);

            int windowSize = end - start + 1;

            maxLen = Math.max(maxLen, windowSize);
            end++;

        }
        return maxLen;
    }
}
