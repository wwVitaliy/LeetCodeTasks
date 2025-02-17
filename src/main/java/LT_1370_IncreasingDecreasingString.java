import java.util.Arrays;

/**
 * 1370. Increasing Decreasing String
 * You are given a string s. Reorder the string using the following algorithm:
 * <p>
 * Remove the smallest character from s and append it to the result.
 * Remove the smallest character from s that is greater than the last appended character, and append it to the result.
 * Repeat step 2 until no more characters can be removed.
 * Remove the largest character from s and append it to the result.
 * Remove the largest character from s that is smaller than the last appended character, and append it to the result.
 * Repeat step 5 until no more characters can be removed.
 * Repeat steps 1 through 6 until all characters from s have been removed.
 * <p>
 * If the smallest or largest character appears more than once, you may choose any occurrence to append to the result.
 * Return the resulting string after reordering s using this algorithm.
 * <p>
 * Example 1:
 * Input: s = "aaaabbbbcccc"
 * Output: "abccbaabccba"
 * Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"
 * After steps 4, 5 and 6 of the first iteration, result = "abccba"
 * First iteration is done. Now s = "aabbcc" and we go back to step 1
 * After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"
 * After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"
 * <p>
 * Example 2:
 * Input: s = "rat"
 * Output: "art"
 * Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.
 * <p>
 * Constraints:
 * 1 <= s.length <= 500
 * s consists of only lowercase English letters.
 */
public class LT_1370_IncreasingDecreasingString {
    public String sortString(String s) {
        if (s.isBlank()) {
            return s;
        }

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        boolean[] isTaken = new boolean[s.length()];

        StringBuilder result = new StringBuilder();

        while (result.length() != chars.length) {

            // step1 - add smallest char
            for (int i = 0; i < chars.length; i++) {
                if (!isTaken[i]) {
                    result.append(chars[i]);
                    isTaken[i] = true;
                    break;
                }
            }

            // step 2-3
            for (int i = 0; i < chars.length; i++) {
                if (!isTaken[i]) {
                    if (chars[i] > result.charAt(result.length() - 1)) {
                        result.append(chars[i]);
                        isTaken[i] = true;
                    }
                }
            }

            // step 4 - add largest char
            for (int i = chars.length - 1; i >= 0; i--) {
                if (!isTaken[i]) {
                    result.append(chars[i]);
                    isTaken[i] = true;
                    break;
                }
            }

            // step 5-6
            for (int i = chars.length - 1; i >= 0; i--) {
                if (!isTaken[i]) {
                    if (chars[i] < result.charAt(result.length() - 1)) {
                        result.append(chars[i]);
                        isTaken[i] = true;
                    }
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        LT_1370_IncreasingDecreasingString myCLass = new LT_1370_IncreasingDecreasingString();

        System.out.println(myCLass.sortString("aaaabbbbcccc"));
        System.out.println(myCLass.sortString("aaaabbbbcccc").equals("abccbaabccba"));
        System.out.println(myCLass.sortString("rat"));
        System.out.println(myCLass.sortString("rat").equals("art"));
    }

}
