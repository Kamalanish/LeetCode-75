/*
https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
*/

public class MergeStringsAlternately {

    public static void main(String[] args) {
        System.out.println("Case 1: " + mergeAlternately("abc", "pqr"));
        System.out.println("Case 2: " + mergeAlternately("ab", "pqrs"));
        System.out.println("Case 3: " + mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();

        int i = 0, j = 0;

        while (i < word1.length() && j < word2.length()) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        while (i < word1.length()) {
            sb.append(word1.substring(i++));
        }
        while (j < word2.length()) {
            sb.append(word2.substring(j++));
        }
        return sb.toString();
    }

}
