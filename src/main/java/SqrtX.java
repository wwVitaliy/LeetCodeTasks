/**
 * 69. Sqrt(x)
 * Given a non-negative integer x,
 * return the square root of x rounded down to the nearest integer.
 * The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * <p>
 * Example 1:
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * <p>
 * Example 2:
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 * <p>
 * Constraints:
 * 0 <= x <= 231 - 1
 */


public class SqrtX {
    public int mySqrt(int x) {
        int i = 1;
        while (x / i >= i) {
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        SqrtX myClass = new SqrtX();

        System.out.println(myClass.mySqrt(4));
        System.out.println(myClass.mySqrt(8));
        System.out.println(myClass.mySqrt(2147395600));
    }
}
