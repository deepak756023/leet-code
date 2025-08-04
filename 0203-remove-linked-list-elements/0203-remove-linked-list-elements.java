/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Remove leading nodes with value == val
        while (head != null && head.val == val) {
            ListNode temp = head.next;
            head.next = null;
            head = temp;
        }

        // Now head is either null or head.val != val
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.next.val == val) {
                ListNode toDelete = current.next;
                current.next = toDelete.next;
                toDelete.next = null;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
