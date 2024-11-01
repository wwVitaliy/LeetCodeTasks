/**
 * Given two strings needle and haystack,
 * return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * <p>
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 * <p>
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */

class FirstOccurrenceInString {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        if (needle.equals(haystack)) return 0;

        short needleLength = (short) needle.length();
        short n = (short) (haystack.length() - needleLength + 1);

        for (short i = 0; i < n; i++) {
            if (haystack.charAt(i) == needle.charAt(0)
                    && haystack.substring(i, i + needleLength).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstOccurrenceInString firstOccurrenceInString = new FirstOccurrenceInString();
        System.out.println(firstOccurrenceInString.strStr("sadbutsad", "sad"));
        System.out.println(firstOccurrenceInString.strStr("leetcode", "leeto"));
        System.out.println(firstOccurrenceInString.strStr("abc", "c"));
        System.out.println(firstOccurrenceInString.strStr(
                "baabbaaaaaaabbaaaaabbabbababaabbabbbbbabbabbbbbbabababaabbbbbaaabbbbabaababababbbaabbbbaaabbaababbbaabaabbabbaaaabababaaabbabbababbabbaaabbbbabbbbabbabbaabbbaa",
                "bbaaaababa"));
    }
}
