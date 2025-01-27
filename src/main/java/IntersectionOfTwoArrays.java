import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 349. Intersection of Two Arrays
 * Given two integer arrays nums1 and nums2,
 * return an array of their intersection.
 * Each element in the result must be unique and you may return the result in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 * <p>
 * Constraints:
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> unicNums1 = new HashSet<>();
        Set<Integer> unicNums2 = new HashSet<>();
        Set<Integer> allNums = new HashSet<>();

        for (int i : nums1) {
            unicNums1.add(i);
            allNums.add(i);
        }

        for (int i : nums2) {
            unicNums2.add(i);
            allNums.add(i);
        }

        Iterator<Integer> iterator = allNums.iterator();
        while (iterator.hasNext()) {
            Integer num = iterator.next();
            if (!unicNums1.contains(num) || !unicNums2.contains(num)) {
                iterator.remove();
            }
        }

        int[] result = new int[allNums.size()];
        iterator = allNums.iterator();
        for (int i = 0; i < allNums.size(); i++) {
            result[i] = (int) iterator.next();
        }

        return result;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays myClass = new IntersectionOfTwoArrays();

        System.out.println(Arrays.toString(myClass.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
        System.out.println(Arrays.toString(myClass.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }
}
