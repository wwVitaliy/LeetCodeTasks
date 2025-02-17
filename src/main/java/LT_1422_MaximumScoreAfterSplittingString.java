/**
 * 1422. Maximum Score After Splitting a String
 * Given a string s of zeros and ones,
 * return the maximum score after splitting the string into two non-empty substrings
 * (i.e. left substring and right substring).
 * <p>
 * The score after splitting a string is the number of zeros in the left substring
 * plus the number of ones in the right substring.
 * <p>
 * Example 1:
 * Input: s = "011101"
 * Output: 5
 * Explanation:
 * All possible ways of splitting s into two non-empty substrings are:
 * left = "0" and right = "11101", score = 1 + 4 = 5
 * left = "01" and right = "1101", score = 1 + 3 = 4
 * left = "011" and right = "101", score = 1 + 2 = 3
 * left = "0111" and right = "01", score = 1 + 1 = 2
 * left = "01110" and right = "1", score = 2 + 1 = 3
 * <p>
 * Example 2:
 * Input: s = "00111"
 * Output: 5
 * Explanation: When left = "00" and right = "111", we get the maximum score = 2 + 3 = 5
 * <p>
 * Example 3:
 * Input: s = "1111"
 * Output: 3
 * <p>
 * Constraints:
 * 2 <= s.length <= 500
 * The string s consists of characters '0' and '1' only.
 */
public class LT_1422_MaximumScoreAfterSplittingString {
    public int maxScore(String s) {
        if (!s.contains("0") || !s.contains("1")) {
            return s.length() - 1;
        }

        char[] chars = s.toCharArray();

        int[] scoreHistogram = new int[chars.length];

        int zeros = 0;
        for (int i = 1; i < chars.length-1; i++) {
            if (chars[i] == '0'){
                zeros++;
            }
            scoreHistogram[i] = zeros;
        }

        int ones = 0;
        for (int i = chars.length - 2; i >= 1; i--) {
            if (chars[i] == '1'){
                ones++;
            }
            scoreHistogram[i] += ones;
        }

        int maxScore = scoreHistogram[0];
        for (int i : scoreHistogram) {
            if (i > maxScore){
                maxScore = i;
            }
        }

        if (chars[0] == '0'){
            maxScore++;
        }
        if (chars[chars.length - 1] == '1'){
            maxScore++;
        }

        return maxScore;
    }

    public static void main(String[] args) {
        LT_1422_MaximumScoreAfterSplittingString myClass = new LT_1422_MaximumScoreAfterSplittingString();

        System.out.println(myClass.maxScore("011101"));
        System.out.println(myClass.maxScore("00111"));
        System.out.println(myClass.maxScore("1111"));
        System.out.println(myClass.maxScore("11100"));
    }
}
