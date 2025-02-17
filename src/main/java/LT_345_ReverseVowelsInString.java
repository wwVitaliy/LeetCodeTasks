/**
 * 345. Reverse Vowels of a String
 * Given a string s, reverse only all the vowels in the string and return it.
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * <p>
 * Example 1:
 * Input: s = "IceCreAm"
 * Output: "AceCreIm"
 * <p>
 * Explanation:
 * The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes "AceCreIm".
 * <p>
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 * <p>
 * Constraints:
 * 1 <= s.length <= 3 * 105
 * s consist of printable ASCII characters.
 */

public class LT_345_ReverseVowelsInString {
    public String reverseVowels(String s) {

        String vowels = "AOUEIaouei";

        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;

        while (i < j) {
            while (i<j){
                if (vowels.contains(String.valueOf(charArray[i]))){
                    break;
                }else{
                    i++;
                }
            }
            while (i<j){
                if (vowels.contains(String.valueOf(charArray[j]))){
                    break;
                }else{
                    j--;
                }
            }

            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;

        }

        return String.valueOf(charArray);
    }


    public static void main(String[] args) {
        LT_345_ReverseVowelsInString myClass = new LT_345_ReverseVowelsInString();

        System.out.println(myClass.reverseVowels("IceCreAm"));
        System.out.println(myClass.reverseVowels("leetcode"));
    }

}
