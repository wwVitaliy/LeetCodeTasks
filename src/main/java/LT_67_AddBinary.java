/**
 * 67. Add Binary
 * Given two binary strings a and b, return their sum as a binary string.
 * <p>
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * <p>
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * <p>
 * Constraints:
 * 1 <= a.length, b.length <= 104
 * a and b consist only of '0' or '1' characters.
 * Each string does not contain leading zeros except for the zero itself.
 */
public class LT_67_AddBinary {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int temp = 0;
        StringBuilder sb = new StringBuilder();

        while (i >= 0 || j >= 0 || temp == 1) {
            if (i >= 0) {
                temp += a.charAt(i) - '0';
            }
            if (j >= 0) {
                temp += b.charAt(j) - '0';
            }
            sb.append(temp % 2);
            temp /= 2;
            i--;
            j--;

        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        LT_67_AddBinary myClass = new LT_67_AddBinary();

        System.out.println(myClass.addBinary("11", "1"));
        System.out.println(myClass.addBinary("1010", "011"));
    }
}
