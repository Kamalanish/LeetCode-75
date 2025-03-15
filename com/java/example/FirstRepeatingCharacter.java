package example;

public class FirstRepeatingCharacter {

    static String firstRepChar(String s) {
        String result = "-1";
        // code here
        boolean[] visited = new boolean[256]; // represents ASCII Range of Character value

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (visited[curr]) {
                return String.valueOf(curr);
            }

            visited[curr] = true;
        }

        return result;
    }
}
