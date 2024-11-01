/**
 * Given the head of a sorted linked list,
 * delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: head = [1,1,2]
 * Output: [1,2]
 * Example 2:
 * <p>
 * <p>
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the list is in the range [0, 300].
 * -100 <= Node.val <= 100
 * The list is guaranteed to be sorted in ascending order.
 */
class RemoveDuplicatesFromSortedLikedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode pointer = head;

        while (pointer.next != null) {
            if (pointer.next.val == pointer.val) {
                pointer.next = pointer.next.next;
            }else{
                pointer = pointer.next;
            }
        }

        return head;
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
        RemoveDuplicatesFromSortedLikedList myClass = new RemoveDuplicatesFromSortedLikedList();

        ListNode list1Node3 = new ListNode(4);
        ListNode list1Node2 = new ListNode(2, list1Node3);
        ListNode list1Node1 = new ListNode(1, list1Node2);

        ListNode list2Node4 = new ListNode(10);
        ListNode list2Node3 = new ListNode(10, list2Node4);
        ListNode list2Node2 = new ListNode(1, list2Node3);
        ListNode list2Node1 = new ListNode(1, list2Node2);

        System.out.println("list1:");
        printList(list1Node1);
        System.out.println("list2:");
        printList(list2Node1);

        printList(myClass.deleteDuplicates(list1Node1));
        printList(myClass.deleteDuplicates(list2Node1));


    }

    private static void printList(ListNode node) {
        if (node == null) {
            System.out.println("null");
            return;
        }
        ListNode nodePointer = node;
        do {
            System.out.print(nodePointer.val);
            System.out.print(" ");
            nodePointer = nodePointer.next;
        } while (nodePointer != null);
        System.out.print("\n");
    }

}
