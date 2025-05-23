import java.util.ArrayList;

/**
 * 136. Single Number
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 * <p>
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 * <p>
 * Constraints:
 * 1 <= nums.length <= 3 * 104
 * -3 * 104 <= nums[i] <= 3 * 104
 * Each element in the array appears twice except for one element which appears only once.
 */

public class LT_136_SingleNumber {
    public int singleNumber(int[] nums) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int num : nums) {
            if (integers.contains(num)){
                integers.remove(Integer.valueOf(num));
            }else{
                integers.add(num);
            }
        }
        return integers.getFirst();
    }

    public static void main(String[] args) {
        LT_136_SingleNumber myClass = new LT_136_SingleNumber();
        System.out.println(myClass.singleNumber(new int[]{2, 2, 1}));
        System.out.println(myClass.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(myClass.singleNumber(new int[]{1}));
    }
}
