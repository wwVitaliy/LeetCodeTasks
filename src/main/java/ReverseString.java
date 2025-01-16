/**
 * 344. Reverse String
 * Write a function that reverses a string.
 * The input string is given as an array of characters s.
 * <p>
 * You must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * Example 1:
 * Input: s = ["h","e","l","l","o"]
 * Output: ["o","l","l","e","h"]
 * <p>
 * Example 2:
 * Input: s = ["H","a","n","n","a","h"]
 * Output: ["h","a","n","n","a","H"]
 * <p>
 * Constraints:
 * 1 <= s.length <= 105
 * s[i] is a printable ascii character.
 */
public class ReverseString {
    public void reverseString(char[] s) {
        char temp;
        int pointer = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[pointer];
            s[pointer] = temp;
            pointer--;
        }
    }

    public static void main(String[] args) {

    }
}
