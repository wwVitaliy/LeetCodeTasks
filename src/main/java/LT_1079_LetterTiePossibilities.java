/**
 * 1079. Letter Tile Possibilities
 * You have n  tiles, where each tile has one letter tiles[i] printed on it.
 * Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.
 * <p>
 * Example 1:
 * Input: tiles = "AAB"
 * Output: 8
 * Explanation: The possible sequences are "A", "B", "AA", "AB", "BA", "AAB", "ABA", "BAA".
 * <p>
 * Example 2:
 * Input: tiles = "AAABBC"
 * Output: 188
 * <p>
 * Example 3:
 * Input: tiles = "V"
 * Output: 1
 * <p>
 * Constraints:
 * 1 <= tiles.length <= 7
 * tiles consists of uppercase English letters.
 */

public class LT_1079_LetterTiePossibilities {
    public int numTilePossibilities(String tiles) {
        return -1;
    }

    public static void main(String[] args) {
        LT_1079_LetterTiePossibilities myClass = new LT_1079_LetterTiePossibilities();

        System.out.println(myClass.numTilePossibilities("AAB"));
        System.out.println(myClass.numTilePossibilities("AAABBC"));
        System.out.println(myClass.numTilePossibilities("V"));
    }
}
