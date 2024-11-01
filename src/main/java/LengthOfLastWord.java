/**
 * Given a string s consisting of words and spaces,
 * return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "Hello World"
 * Output: 5
 * Explanation: The last word is "World" with length 5.
 * Example 2:
 * <p>
 * Input: s = "   fly me   to   the moon  "
 * Output: 4
 * Explanation: The last word is "moon" with length 4.
 * Example 3:
 * <p>
 * Input: s = "luffy is still joyboy"
 * Output: 6
 * Explanation: The last word is "joyboy" with length 6.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */


class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        if (!s.contains(" ")) return s.length();
        if (s.isBlank()) return -1;

//        String[] words = s.split(" ");
//
//        for (int i = words.length - 1 ; i >= 0 ; i--) {
//           if (!words[i].isBlank()) return words[i].length();
//        }
//        return -1;

        StringBuilder lastWord = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0
        && s.charAt(i) != ' ') {
            lastWord.append(s.charAt(i));
            i--;
        }

        return lastWord.length();
    }

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord.lengthOfLastWord("a "));

    }
}
