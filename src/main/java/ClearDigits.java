import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 3174. Clear Digits
 * You are given a string s.
 * Your task is to remove all digits by doing this operation repeatedly:
 * Delete the first digit and the closest non-digit character to its left.
 * Return the resulting string after removing all digits.
 * <p>
 * Example 1:
 * Input: s = "abc"
 * Output: "abc"
 * Explanation:
 * There is no digit in the string.
 * <p>
 * Example 2:
 * Input: s = "cb34"
 * Output: ""
 * Explanation:
 * First, we apply the operation on s[2], and s becomes "c4".
 * Then we apply the operation on s[1], and s becomes "".
 * <p>
 * Constraints:
 * 1 <= s.length <= 100
 * s consists only of lowercase English letters and digits.
 * The input is generated such that it is possible to delete all digits.
 */
public class ClearDigits {

    // Variant 1
//    public String clearDigits(String s) {
//        char[] chars = s.toCharArray();
//        Set<Integer> indexesToRemove = new HashSet<>();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (Character.isDigit(chars[i])) {
//                indexesToRemove.add(i);
//                for (int j = i - 1; ; j--) {
//                    if (!indexesToRemove.contains(j)) {
//                        indexesToRemove.add(j);
//                        break;
//                    }
//                }
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//
//        for (int i = 0; i < chars.length; i++) {
//            if (!indexesToRemove.contains(i)) {
//                result.append(chars[i]);
//            }
//        }
//
//        return result.toString();
//    }

    // Variant 2
//    public String clearDigits(String s) {
//        char[] chars = s.toCharArray();
//        LinkedList<Character> stack = new LinkedList<>();
//
//        for (char aChar : chars) {
//            if (Character.isAlphabetic(aChar)) {
//                stack.push(aChar);
//            } else {
//                stack.pop();
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//
//        while (!stack.isEmpty()) {
//            result.append(stack.pop());
//        }
//
//        return result.reverse().toString();
//    }

    // Variant 3
    public String clearDigits(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);

        int charIndex = 0;

        while (charIndex < stringBuilder.length()) {
            if (Character.isDigit(stringBuilder.charAt(charIndex))) {
                stringBuilder.deleteCharAt(charIndex);
                if (charIndex > 0) {
                    stringBuilder.deleteCharAt(charIndex - 1);
                    charIndex--;
                }
            } else {
                charIndex++;
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ClearDigits myClass = new ClearDigits();

        System.out.println(myClass.clearDigits("abc"));
        System.out.println(myClass.clearDigits("cb34"));
    }

}
