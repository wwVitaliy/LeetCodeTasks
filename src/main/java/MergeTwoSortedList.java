/**
 * You are given the heads of two sorted linked lists list1 and list2.
 * <p>
 * Merge the two lists into one sorted list.
 * The list should be made by splicing together the nodes of the first two lists.
 * <p>
 * Return the head of the merged linked list.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 * <p>
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 * <p>
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */

class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode smallListPointer = list1.val <= list2.val ? list1 : list2;
        ListNode bigListPointer = list1.val <= list2.val ? list2 : list1;
        ListNode mergedLists = smallListPointer;
        ListNode mergedListsPointer = mergedLists;

        smallListPointer = smallListPointer.next;

        while (smallListPointer != null && bigListPointer != null) {
            if (smallListPointer.val <= bigListPointer.val) {
                mergedListsPointer.next = smallListPointer;
                smallListPointer = smallListPointer.next;
            } else {
                mergedListsPointer.next = bigListPointer;
                bigListPointer = bigListPointer.next;
            }
            mergedListsPointer = mergedListsPointer.next;
        }

        if (smallListPointer != null){
            mergedListsPointer.next = smallListPointer;
        }

        if (bigListPointer != null){
            mergedListsPointer.next = bigListPointer;
        }

        return mergedLists;
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
        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();

        ListNode list1Node3 = new ListNode(4);
        ListNode list1Node2 = new ListNode(2, list1Node3);
        ListNode list1Node1 = new ListNode(1, list1Node2);

        ListNode list2Node4 = new ListNode(10);
        ListNode list2Node3 = new ListNode(9, list2Node4);
        ListNode list2Node2 = new ListNode(8, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node2);

        System.out.println("list1:");
        printList(list1Node1);
        System.out.println("list2:");
        printList(list2Node1);

        ListNode mergedLists = mergeTwoSortedList.mergeTwoLists(list1Node1, list2Node1);

        System.out.println("Merged list:");
        printList(mergedLists);


    }

    private static void printList(ListNode node) {
        if (node == null) System.out.println("[]");
        ListNode nodePointer = node;
        do {
            System.out.println(nodePointer.val);
            nodePointer = nodePointer.next;
        } while (nodePointer != null);
    }
}
