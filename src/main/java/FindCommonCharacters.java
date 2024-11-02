import java.util.*;

/**
 * Given a string array words, return an array of all characters
 * that show up in all strings within the words (including duplicates).
 * You may return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["bella","label","roller"]
 * Output: ["e","l","l"]
 * Example 2:
 * <p>
 * Input: words = ["cool","lock","cook"]
 * Output: ["c","o"]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= words.length <= 100
 * 1 <= words[i].length <= 100
 * words[i] consists of lowercase English letters.
 */

class FindCommonCharacters {
    public List<String> commonChars(String[] words) {
        if (words.length == 0) return new ArrayList<>();
        List<String> result = new LinkedList<>(Arrays.asList(words[0].split("")));

        for (int i = 1; i < words.length; i++) {
            List<String> iWord = new LinkedList<>(Arrays.asList(words[i].split("")));

            Iterator<String> iterator = result.iterator();
            while (iterator.hasNext()) {
                String s = iterator.next();
                if (iWord.contains(s)) {
                    iWord.remove(s);
                } else {
                    iterator.remove();
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        FindCommonCharacters myClass = new FindCommonCharacters();
        System.out.println(myClass.commonChars(new String[]{}));
        System.out.println(myClass.commonChars(new String[]{"bella"}));
        System.out.println(myClass.commonChars(new String[]{"bella", "label", "roller"}));
        System.out.println(myClass.commonChars(new String[]{"cool", "lock", "cook"}));
    }
}
