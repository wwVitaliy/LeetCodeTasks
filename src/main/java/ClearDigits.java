import java.util.HashSet;
import java.util.Set;

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
    public String clearDigits(String s) {
        char[] chars = s.toCharArray();
        Set<Integer> indexesToRemove = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
                indexesToRemove.add(i);
                for (int j = i - 1; ; j--) {
                    if (!indexesToRemove.contains(j)) {
                        indexesToRemove.add(j);
                        break;
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (!indexesToRemove.contains(i)) {
                result.append(chars[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ClearDigits myClass = new ClearDigits();

        System.out.println(myClass.clearDigits("abc"));
        System.out.println(myClass.clearDigits("cb34"));
    }

}
