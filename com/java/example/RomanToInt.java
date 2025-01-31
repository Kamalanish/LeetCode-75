package example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        String roman = "MCMXCIV";// IX
        System.out.println(romanToInt(roman));
    }

    public static int romanToInt(String s) {

        Map<Character, Integer> romanValues = new HashMap<>();

        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            char romanLetter = s.charAt(i);
            if (i + 1 < s.length() && romanValues.get(s.charAt(i + 1)) > romanValues.get(romanLetter)) {
                result = result + (romanValues.get(s.charAt(i + 1)) - romanValues.get(romanLetter));
                i++;
            } else {
                result += romanValues.get(romanLetter);
            }
        }
        return result;

    }
}
