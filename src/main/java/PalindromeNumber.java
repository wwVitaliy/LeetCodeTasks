import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 * Example 2:
 * <p>
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 * <p>
 * <p>
 * Follow up: Could you solve it without converting the integer to a string?
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
//        if (x < 0) return false;
//        if (x < 10) return true;
//
//        List<Character> reversedCharsFromInt = new ArrayList<>();
//        while (x > 0) {
//            reversedCharsFromInt.add(Character.forDigit((x % 10), 10));
//            x = x / 10;
//        }
//
//        int countOfChars = reversedCharsFromInt.size();
//        int halfOfChars = reversedCharsFromInt.size()/2;
//
//        for (int i = 0; i < n; i++) {
//            if (!reversedCharsFromInt.get(i).equals(reversedCharsFromInt.get(countOfChars - 1 - i))){
//                return false;
//            }
//        }
//        return true;

        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        if (x < 10) return true;

        int reversed = 0;
        int temp = x;

        while (reversed < temp) {
            int digit = temp % 10;
            temp = (int) temp / 10;
            reversed = reversed * 10 + digit;
        }

        return (reversed == temp || reversed / 10 == temp);

    }
}
