package example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalSumFromString {

    public static void main(String[] args) {
        String str = "1 Rental $70000 Shopping $299 Expenses houses $200000";

        findSumWithPattern(str);

        findSum(str);

    }

    private static int findSumWithPattern(String str) {

        int totalSum = 0;

        Pattern pattern = Pattern.compile("\\$(\\d++)");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            totalSum += Integer.parseInt(matcher.group(1));
        }
        return totalSum;

    }

    private static int findSum(String str) {
        //1 Rental $70000 Shopping $299 Expenses houses $200000
        int totalSum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '$') {
                int num = 0;

                i++;
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    num = num * 10 + (str.charAt(i) - '0');
                    i++;
                }

                totalSum += num;
            }
        }
        return totalSum;
    }
}
