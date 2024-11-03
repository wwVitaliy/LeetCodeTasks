/**
 * Given two strings s and goal,
 * return true if and only if s can become goal after some number of shifts on s.
 * <p>
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * <p>
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcde", goal = "cdeab"
 * Output: true
 * Example 2:
 * <p>
 * Input: s = "abcde", goal = "abced"
 * Output: false
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length, goal.length <= 100
 * s and goal consist of lowercase English letters.
 */

class RotateString {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;

        char firstLetter = goal.charAt(0);
        StringBuilder newS = new StringBuilder(s);
        StringBuilder newGoal = new StringBuilder(goal);

        int i = 0;
        while (i < s.length()) {
            int n = newS.indexOf(String.valueOf(firstLetter));
            if (n < 0 ) return false;
            for (int j = 0; j < n; j++) {
                newS
                        .append(newS.charAt(0))
                        .deleteCharAt(0);
            }
            if (newS.compareTo(newGoal) == 0) return true;
            if (n == 0) {
                newS
                        .append(newS.charAt(0))
                        .deleteCharAt(0);
                i++;
            } else {
                i += n;
            }
        }


        return false;
    }

    public static void main(String[] args) {
        RotateString myClass = new RotateString();
//        System.out.println(myClass.rotateString("abcde", "cdeab"));
//        System.out.println(myClass.rotateString("abcde", "abced"));
//        System.out.println(myClass.rotateString("ohbrwzxvxe", "uornhegseo"));
        System.out.println(myClass.rotateString("bbbacddceeb", "ceebbbbacdd"));
    }
}
