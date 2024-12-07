import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2848. Points That Intersect With Cars
 * You are given a 0-indexed 2D integer array nums
 * representing the coordinates of the cars parking on a number line.
 * For any index i, nums[i] = [starti, endi]
 * where starti is the starting point of the ith car and endi is the ending point of the ith car.
 * <p>
 * Return the number of integer points on the line that are covered with any part of a car.
 * <p>
 * Example 1:
 * Input: nums = [[3,6],[1,5],[4,7]]
 * Output: 7
 * Explanation: All the points from 1 to 7 intersect at least one car, therefore the answer would be 7.
 * <p>
 * Example 2:
 * Input: nums = [[1,3],[5,8]]
 * Output: 7
 * Explanation: Points intersecting at least one car are 1, 2, 3, 5, 6, 7, 8.
 * There are a total of 7 points, therefore the answer would be 7.
 * <p>
 * Constraints:
 * 1 <= nums.length <= 100
 * nums[i].length == 2
 * 1 <= starti <= endi <= 100
 */

public class PointThatIntersectsWithCars {
    public int numberOfPoints(List<List<Integer>> nums) {
        Set<Integer> integers = new HashSet<>();

        for (List<Integer> num : nums) {
            for (Integer i = num.getFirst(); i <= num.getLast(); i++) {
                integers.add(i);
            }
        }

        return integers.size();
    }

    public static void main(String[] args) {
        PointThatIntersectsWithCars myClass = new PointThatIntersectsWithCars();

        System.out.println(myClass.numberOfPoints(List.of(List.of(3, 6), List.of(1, 5), List.of(4, 7))));
        System.out.println(myClass.numberOfPoints(List.of(List.of(1, 3), List.of(5, 8))));
    }
}
