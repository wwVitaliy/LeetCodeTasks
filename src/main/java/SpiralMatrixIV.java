import java.util.Arrays;

/**
 * You are given two integers m and n, which represent the dimensions of a matrix.
 * <p>
 * You are also given the head of a linked list of integers.
 * <p>
 * Generate an m x n matrix that contains the integers in the linked list
 * presented in spiral order (clockwise), starting from the top-left of the matrix.
 * If there are remaining empty spaces, fill them with -1.
 * <p>
 * Return the generated matrix.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: m = 3, n = 5, head = [3,0,2,6,8,1,7,9,4,2,5,5,0]
 * Output: [[3,0,2,6,8],[5,0,-1,-1,1],[5,2,4,9,7]]
 * Explanation: The diagram above shows how the values are printed in the matrix.
 * Note that the remaining spaces in the matrix are filled with -1.
 * Example 2:
 * <p>
 * <p>
 * Input: m = 1, n = 4, head = [0,1,2]
 * Output: [[0,1,2,-1]]
 * Explanation: The diagram above shows how the values are printed from left to right in the matrix.
 * The last space in the matrix is set to -1.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= m, n <= 105
 * 1 <= m * n <= 105
 * The number of nodes in the list is in the range [1, m * n].
 * 0 <= Node.val <= 1000
 */

class SpiralMatrixIV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] array = new int[m][n];

        int horizontalFirst = 0;
        int horizontalLast = n;
        int verticalFirst = 0;
        int verticalLast = m;

        int i = 0;
        int j = 0;
        int step = 0;
        while (step < m * n) {
            for (j = horizontalFirst; j < horizontalLast; j++) {
                array[i][j] = head != null ? head.val : -1;
                head = head != null ? head.next : null;
                step++;
                if (step == m * n) return array;
            }
            verticalFirst++;
            j--;

            for (i = verticalFirst; i < verticalLast; i++) {
                array[i][j] = head != null ? head.val : -1;
                head = head != null ? head.next : null;
                step++;
                if (step == m * n) return array;

            }
            horizontalLast--;
            i--;

            for (j = horizontalLast - 1; j >= horizontalFirst; j--) {
                array[i][j] = head != null ? head.val : -1;
                head = head != null ? head.next : null;
                step++;
                if (step == m * n) return array;
            }
            verticalLast--;
            j++;

            for (i = verticalLast - 1; i >= verticalFirst; i--) {
                array[i][j] = head != null ? head.val : -1;
                head = head != null ? head.next : null;
                step++;
                if (step == m * n) return array;

            }
            horizontalFirst++;
            i++;
        }

        return array;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SpiralMatrixIV myClass = new SpiralMatrixIV();
        System.out.println(Arrays.toString(myClass.spiralMatrix(5, 3, null)));

    }
}
