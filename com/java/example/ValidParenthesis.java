package example;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/
public class ValidParenthesis {

    public static void main(String[] args) {
        String input = "()[]{}{}";

        System.out.println(isValidParanthesis(input));


    }

    public static boolean isValidParanthesis(String input) {
        if (input.length() % 2 != 0) {
            return false;
        }

        char[] chars = input.toCharArray();

        Stack<Character> characterStack = new Stack<>();

        for (char ch : chars) {

            if (ch == '(' || ch == '[' || ch == '{') {
                characterStack.push(ch);
            } else if (ch == ')' && !characterStack.empty() && characterStack.peek() == '(') {
                characterStack.pop();
            } else if (ch == ']' && !characterStack.empty() && characterStack.peek() == '[') {
                characterStack.pop();
            } else if (ch == '}' && !characterStack.empty() && characterStack.peek() == '{') {
                characterStack.pop();
            }

        }

        return characterStack.empty();
    }
}
