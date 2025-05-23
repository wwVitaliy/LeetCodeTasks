import java.util.ArrayList;
import java.util.List;

/**
 * 20. Valid Parentheses
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 * <p>
 * Example 1:
 * Input: s = "()"
 * Output: true
 * <p>
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 * <p>
 * Example 3:
 * Input: s = "(]"
 * Output: false
 * Example 4:
 * Input: s = "([])"
 * Output: true
 * <p>
 * Constraints:
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */

public class LT_20_ValidParentheses {
//    public boolean isValid(String s) {
//        if (s.length() % 2 == 1) {
//            return false;
//        }
//
//        int startLength;
//        int endLength = s.length();
//
//        do {
//            startLength = endLength;
//
//            s = s.replace("{}", "");
//            s = s.replace("()", "");
//            s = s.replace("[]", "");
//
//            endLength = s.length();
//
//        } while (startLength != endLength);
//
//        return s.isEmpty();
//    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        char[] chars = s.toCharArray();
        List<Character> stack = new ArrayList<>();

        for (char ch : chars) {
            if (ch == '(') {
                stack.add(')');
            } else if (ch == '{') {
                stack.add('}');
            } else if (ch == '[') {
                stack.add(']');
            } else if (stack.isEmpty() || stack.removeLast() != ch) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LT_20_ValidParentheses myClass = new LT_20_ValidParentheses();

        System.out.println(myClass.isValid("()"));
        System.out.println(myClass.isValid("()[]{}"));
        System.out.println(myClass.isValid("(]"));
        System.out.println(myClass.isValid("([])"));
    }
}
