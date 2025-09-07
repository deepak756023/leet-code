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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        var dummyHead = head.next;
        var lastReference = new ListNode(0);

        var previous = head;
        var current = previous.next;

        while (current != null) {
            var temp = current.next;
            lastReference.next = current;
            current.next = previous;
            previous.next = temp;

            lastReference = previous;
            previous = temp;

            if (previous == null)
                break;

            current = previous.next;

        }
        return dummyHead;

    }
}
