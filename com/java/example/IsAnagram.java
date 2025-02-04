package example;

import java.util.HashMap;
import java.util.Map;

public class IsAnagram {


    public static void main(String[] args) {

        String a = "aacc";
        String b = "caac";

        System.out.println(isAnagram(a, b));
        System.out.println(validAnagram(a, b));

    }

    static boolean isAnagram(String a, String b) {

        if (a.length() != b.length()) return false;
        Map<Character, Integer> charMap = new HashMap<>();

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            charMap.put(a.charAt(i), charMap.getOrDefault(a.charAt(i), 0) + 1);
        }

        for (int j = 0; j < b.length(); j++) {
            char key = b.charAt(j);
            if (charMap.containsKey(key)) {
                Integer i = charMap.get(key);
                if (i == 1) {
                    charMap.remove(key);
                } else {
                    charMap.put(key, i - 1);
                }
            }
        }

        return charMap.isEmpty();
    }

    static boolean validAnagram(String a, String b){
        if(a.length() != b.length()){
            return false;
        }

        int [] count = new int [26];

        for(char c : a.toCharArray()){
            count[c - 'a']++;
        }

        for(char c : b.toCharArray()){
            count[c - 'a']--;
        }

        for(int i : count){
            if(i != 0)
                return false;
        }

        return true;
    }
}
