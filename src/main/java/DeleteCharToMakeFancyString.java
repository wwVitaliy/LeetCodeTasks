/**
 * A fancy string is a string where no three consecutive characters are equal.
 * Given a string s, delete the minimum possible number of characters from s to make it fancy.
 * Return the final string after the deletion. It can be shown that the answer will always be unique.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leeetcode"
 * Output: "leetcode"
 * Explanation:
 * Remove an 'e' from the first group of 'e's to create "leetcode".
 * No three consecutive characters are equal, so return "leetcode".
 * Example 2:
 * <p>
 * Input: s = "aaabaaaa"
 * Output: "aabaa"
 * Explanation:
 * Remove an 'a' from the first group of 'a's to create "aabaaaa".
 * Remove two 'a's from the second group of 'a's to create "aabaa".
 * No three consecutive characters are equal, so return "aabaa".
 * Example 3:
 * <p>
 * Input: s = "aab"
 * Output: "aab"
 * Explanation: No three consecutive characters are equal, so return "aab".
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 105
 * s consists only of lowercase English letters.
 */

class DeleteCharToMakeFancyString {
    public String makeFancyString(String s) {
        if (s.length() < 3) return s;

//  Solution #1
//        for (int i = 0; i < s.length() - 2; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)
//                    && s.charAt(i) == s.charAt(i + 2)) {
//                int pointer = i + 3;
//                while (pointer < s.length() - 1
//                        && s.charAt(pointer) == s.charAt(i)) {
//                    pointer++;
//                }
//                s = s.substring(0, i + 2)
//                        + s.substring(pointer);
//                i--;
//            }
//        }
//        return s;

////  Solution #2
//        StringBuffer stringBuffer = new StringBuffer();
//        int pointer = 0;
//
//        for (int i = 0; i < s.length() - 2; ) {
//            if (s.charAt(i) == s.charAt(i + 1)
//                    && s.charAt(i) == s.charAt(i + 2)) {
//                stringBuffer
//                        .append(s.charAt(i))
//                        .append(s.charAt(i));
//
//                pointer = i + 3;
//                while (pointer < s.length()
//                        && s.charAt(i) == s.charAt(pointer)) {
//                    pointer++;
//                }
//            } else {
//                stringBuffer
//                        .append(s.charAt(i));
//                pointer++;
//            }
//            i = pointer;
//        }
//        if (pointer < s.length()) {
//            stringBuffer.append(s.substring(pointer));
//        }
//
//        return stringBuffer.toString();

//  Solution #3
        StringBuffer result = new StringBuffer();
        result.append(s.charAt(0));
        int counter = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == result.charAt(result.length() - 1)){
                counter++;
                if (counter < 3){
                    result.append(s.charAt(i));
                }
            }else{
                counter = 1;
                result.append(s.charAt(i));
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        DeleteCharToMakeFancyString myClass = new DeleteCharToMakeFancyString();

        System.out.println(myClass.makeFancyString("leeetcode"));
        System.out.println(myClass.makeFancyString("aaabaaaa"));
        System.out.println(myClass.makeFancyString("aab"));
        System.out.println(myClass.makeFancyString("aaax"));
    }
}
