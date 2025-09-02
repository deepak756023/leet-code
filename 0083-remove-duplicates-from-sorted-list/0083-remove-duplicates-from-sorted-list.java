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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        var previous = head;
        var current = head.next;
        while (current.next != null) {
            var next = current.next;
            if (current.val == previous.val) {
                current = next;
                previous.next = current;

            } else {
                previous = current;
                current = next;
            }

        }
        if (current.val == previous.val)
            previous.next = null;

        return head;

    }
}