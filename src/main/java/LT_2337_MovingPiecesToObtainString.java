/**
 * 2337. Move Pieces to Obtain a String
 * <p>
 * You are given two strings start and target, both of length n.
 * Each string consists only of the characters 'L', 'R', and '_' where:
 * <p>
 * The characters 'L' and 'R' represent pieces,
 * where a piece 'L' can move to the left only if there is a blank space directly to its left,
 * and a piece 'R' can move to the right only if there is a blank space directly to its right.
 * The character '_' represents a blank space that can be occupied by any of the 'L' or 'R' pieces.
 * Return true if it is possible to obtain the string target
 * by moving the pieces of the string start any number of times.
 * Otherwise, return false.
 * <p>
 * Example 1:
 * <p>
 * Input: start = "_L__R__R_", target = "L______RR"
 * Output: true
 * Explanation: We can obtain the string target from start by doing the following moves:
 * - Move the first piece one step to the left, start becomes equal to "L___R__R_".
 * - Move the last piece one step to the right, start becomes equal to "L___R___R".
 * - Move the second piece three steps to the right, start becomes equal to "L______RR".
 * Since it is possible to get the string target from start, we return true.
 * Example 2:
 * <p>
 * Input: start = "R_L_", target = "__LR"
 * Output: false
 * Explanation: The 'R' piece in the string start can move one step to the right to obtain "_RL_".
 * After that, no pieces can move anymore, so it is impossible to obtain the string target from start.
 * Example 3:
 * <p>
 * Input: start = "_R", target = "R_"
 * Output: false
 * Explanation: The piece in the string start can move only to the right, so it is impossible to obtain the string target from start.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * n == start.length == target.length
 * 1 <= n <= 105
 * start and target consist of the characters 'L', 'R', and '_'.
 */

public class LT_2337_MovingPiecesToObtainString {
    public boolean canChange(String start, String target) {
        if (target.isBlank()) {
            return true;
        }

        if (start.equals(target)) {
            return true;
        }

        if (!start.replace("_", "")
                .equals(target.replace("_", ""))) {
            return false;
        }

        int pointer = 0;

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == 'L') {
                for (int j = pointer; j < start.length(); j++) {
                    if (start.charAt(j) == 'L') {
                        pointer = j + 1;
                        break;
                    }
                }
                if (pointer - 1 < i) {
                    return false;
                }
            }

            if (target.charAt(i) == 'R') {
                for (int j = pointer; j < start.length(); j++) {
                    if (start.charAt(j) == 'R') {
                        pointer = j + 1;
                        break;
                    }
                }
                if (pointer - 1 > i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LT_2337_MovingPiecesToObtainString myClass = new LT_2337_MovingPiecesToObtainString();
//        System.out.println(myClass.canChange("_L__R__R_", "L______RR"));
        System.out.println(myClass.canChange("__R_R_R_L", "____RRR_L"));
//        System.out.println(myClass.canChange("R_L_", "__LR"));
//        System.out.println(myClass.canChange("_R", "R_"));
//        System.out.println(myClass.canChange("_R", "R_"));
//        System.out.println(myClass.canChange("L_L___", "LL____"));


    }


}
