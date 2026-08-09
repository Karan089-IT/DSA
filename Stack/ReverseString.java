//reverse a string using a stack

import java.util.Stack;

public class ReverseString {

    public static String reverseString(String str) {

        Stack<Character> s = new Stack<>();

        int idx = 0;

        // Push all characters into stack
        while (idx < str.length()) {
            s.push(str.charAt(idx));  //s.push(Character.valueOf(str.charAt(idx)));
            idx++;
        }

        StringBuilder result = new StringBuilder("");

        // Pop characters from stack
        while (!s.isEmpty()) {
            char curr = s.pop(); // char curr = s.pop().charValue();
            result.append(curr);
        }

        return result.toString();
    }

    public static void main(String[] args) {

        String str = "abc";
        String result = reverseString(str);
        System.out.println(result);
    }
}
