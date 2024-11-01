/**
 * Given a sorted array of distinct integers and a target value,
 * return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */

class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums[0] >= target) return 0;
        if (nums[nums.length - 1] < target) return nums.length;

        short startIndex = 0;
        short endIndex = (short) (nums.length - 1);
        short pointer = (short) ((endIndex - startIndex) / 2 + startIndex);

        while (nums[pointer] > target
                || nums[pointer + 1] < target) {

            if (nums[pointer] > target) {
                endIndex = (short) (pointer);
            }

            if (nums[pointer + 1] < target) {
                startIndex = (short) (pointer + 1);
            }

            pointer = (short) ((endIndex - startIndex) / 2 + startIndex);

        }
        return nums[pointer] == target ? pointer : pointer + 1;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsertPosition.searchInsert(new int[]{1, 3, 5, 6}, 7));
    }
}
