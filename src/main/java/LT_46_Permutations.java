import java.util.List;

/**
 * 46. Permutations
 * Given an array nums of distinct integers, return all the possible permutations.
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 * <p>
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 6
 * -10 <= nums[i] <= 10
 * All the integers of nums are unique.
 */
public class LT_46_Permutations {
    public List<List<Integer>> permute(int[] nums) {
        return null;
    }

    public static void main(String[] args) {
        LT_46_Permutations myClass = new LT_46_Permutations();

        System.out.println(myClass.permute(new int[]{1, 2, 3}));
        System.out.println(myClass.permute(new int[]{0, 1}));
        System.out.println(myClass.permute(new int[]{1}));
    }
}
