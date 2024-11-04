/**
 * Given a string word, compress it using the following algorithm:
 * <p>
 * Begin with an empty string comp. While word is not empty, use the following operation:
 * Remove a maximum length prefix of word
 * made of a single character c repeating at most 9 times.
 * Append the length of the prefix followed by c to comp.
 * Return the string comp.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: word = "abcde"
 * <p>
 * Output: "1a1b1c1d1e"
 * <p>
 * Explanation:
 * <p>
 * Initially, comp = "". Apply the operation 5 times,
 * choosing "a", "b", "c", "d", and "e" as the prefix in each operation.
 * <p>
 * For each prefix, append "1" followed by the character to comp.
 * <p>
 * Example 2:
 * <p>
 * Input: word = "aaaaaaaaaaaaaabb"
 * <p>
 * Output: "9a5a2b"
 * <p>
 * Explanation:
 * <p>
 * Initially, comp = "". Apply the operation 3 times,
 * choosing "aaaaaaaaa", "aaaaa", and "bb" as the prefix in each operation.
 * <p>
 * For prefix "aaaaaaaaa", append "9" followed by "a" to comp.
 * For prefix "aaaaa", append "5" followed by "a" to comp.
 * For prefix "bb", append "2" followed by "b" to comp.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= word.length <= 2 * 105
 * word consists only of lowercase English letters.
 */


class StringCompressionIII {
    public String compressedString(String word) {
        if (word.isBlank()) return "";

        StringBuilder compressed = new StringBuilder();

        char reference = word.charAt(0);
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == reference
                    && count < 9) {
                count++;
            } else {
                compressed.append(count)
                        .append(reference);
                reference = word.charAt(i);
                count = 1;
            }
        }
        compressed.append(count)
                .append(reference);


        return compressed.toString();
    }

    public static void main(String[] args) {
        StringCompressionIII myClass = new StringCompressionIII();
        System.out.println(myClass.compressedString("abcde"));
        System.out.println(myClass.compressedString("aaaaaaaaaaaaaabb"));
    }

}
