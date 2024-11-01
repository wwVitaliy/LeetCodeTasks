/**
 * Write a function to find the longest common prefix string
 * amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lowercase English letters.
 */

class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        String result = strs[0];
        short pointer = 1;

        while (pointer < strs.length
                && !result.isEmpty()) {

            if (result.length() > strs[pointer].length()) {
                result = result.substring(0, strs[pointer].length());
            }

            for (short i = 0; i < result.length(); i++) {
                if (result.charAt(i) != strs[pointer].charAt(i)) {
                    result = result.substring(0, i);
                }
            }
            pointer++;
        }
        return result;
    }

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefix(
                new String[]{
                        "flower", "flow", "flight"
                }));
    }

}
