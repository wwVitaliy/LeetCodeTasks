import java.util.HashMap;
import java.util.Map;

/**
 * 205. Isomorphic Strings
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * <p>
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Explanation:
 * The strings s and t can be made identical by:
 * Mapping 'e' to 'a'.
 * Mapping 'g' to 'd'.
 * <p>
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Explanation:
 * The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
 * <p>
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 * <p>
 * Constraints:
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */
public class LT_205_IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> charsMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (!charsMap.containsKey(charS)
                    && !charsMap.containsValue(charT)) {
                charsMap.put(charS, charT);
            } else if ((charsMap.containsKey(charS) && !charsMap.get(charS).equals(charT))
                    || (!charsMap.containsKey(charS) && charsMap.containsValue(charT))
            ) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LT_205_IsomorphicString myClass = new LT_205_IsomorphicString();

        System.out.println(myClass.isIsomorphic("egg", "add"));
        System.out.println(myClass.isIsomorphic("foo", "bar"));
        System.out.println(myClass.isIsomorphic("paper", "title"));
        System.out.println(myClass.isIsomorphic("bbbaaaba", "aaabbbba"));
    }
}
