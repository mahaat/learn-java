import java.util.EmptyStackException;
import java.util.Stack;

public class BalancedBrackets {
    static String isBalanced(String s) {
        char[] sChars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        String result = "YES";
        for (int i = 0; i < sChars.length; i++) {
            char currChar = sChars[i];
            switch (currChar) {
                case '{': {
                    stack.push('}');
                    break;
                }
                case '[': {
                    stack.push(']');
                    break;
                }
                case '(': {
                    stack.push(')');
                    break;
                }
                default: {
                    try {
                        Character lastChar = stack.pop();
                        if (!lastChar.equals(currChar)) {
                            result = "NO";
                        }
                    } catch (Exception ex) {
                        result = "NO";
                    }

                }
            }

        }

        return result;
    }
}
