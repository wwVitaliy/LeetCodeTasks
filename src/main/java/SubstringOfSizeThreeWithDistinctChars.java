/**
 * 1876. Substrings of Size Three with Distinct Characters
 * A string is good if there are no repeated characters.
 * <p>
 * Given a string s, return the number of good substrings of length three in s.
 * Note that if there are multiple occurrences of the same substring,
 * every occurrence should be counted.
 * A substring is a contiguous sequence of characters in a string.
 * <p>
 * Example 1:
 * Input: s = "xyzzaz"
 * Output: 1
 * Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
 * The only good substring of length 3 is "xyz".
 * <p>
 * Example 2:
 * Input: s = "aababcabc"
 * Output: 4
 * Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
 * The good substrings are "abc", "bca", "cab", and "abc".
 * <p>
 * Constraints:
 * 1 <= s.length <= 100
 * s consists of lowercase English letters.
 */

public class SubstringOfSizeThreeWithDistinctChars {
    public int countGoodSubstrings(String s) {
        if (s.length() < 3) {
            return 0;
        }
        int goodStringsCount = 0;

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length - 2; i++) {
            if (chars[i] != chars[i+1]
                    && chars[i+1] != chars[i + 2]
                    && chars[i] != chars[i+2]){
                goodStringsCount++;
            }
        }
        return goodStringsCount;



        
    }

    public static void main(String[] args) {
        SubstringOfSizeThreeWithDistinctChars myClass = new SubstringOfSizeThreeWithDistinctChars();

        System.out.println(myClass.countGoodSubstrings("xyzzaz"));
        System.out.println(myClass.countGoodSubstrings("aababcabc"));
    }
}
