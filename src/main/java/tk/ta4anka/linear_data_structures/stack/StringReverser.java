package tk.ta4anka.linear_data_structures.stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String string) {
        if (string == null) {
            throw new IllegalArgumentException();
        }
        Stack<Character> stack = new Stack<>();

        /* for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }*/
        for (char ch : string.toCharArray()) {
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}
