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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        var previous = head;
        var current = previous.next;
        head.next = null;
        while(current != null){
            var next = current.next;

            current.next = previous;
            previous = current;
            current = next;

        }
        head = previous;



        return head;

    }
}