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
        if (head == null || head.next == null) {
            return head;
        }

        var newHead = head.next;

        var previous = head;
        var current = head.next;

        // First swap
        previous.next = current.next;
        current.next = previous;

        // Continue swapping
        while (previous.next != null && previous.next.next != null) {
            var newP = previous.next;         // first node of next pair
            var newC = previous.next.next;    // second node of next pair

            // swap
            previous.next = newC;
            newP.next = newC.next;
            newC.next = newP;

            // move forward
            previous = newP;
        }

        return newHead;
    }
}
