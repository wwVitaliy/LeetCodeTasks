import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * <p>
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 * <p>
 * Constraints:
 * 2 <= nums.length <= 104
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * Only one valid answer exists
 */

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
//        for (int i = 0; i < nums.length;i++){
//            for (int j = 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) return new int[]{i,j};
//            }
//        }
//        return new int[0];

        Map<Integer, Integer> myMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (myMap.containsKey(complement)) {
                return new int[]{myMap.get(complement), i};
            }
            myMap.put(nums[i], i);
        }

        return new int[0];
    }
}
