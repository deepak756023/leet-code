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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        if (head.next == null && n == 1)
            return null;

        if(head.next.next == null){
            if(n == 1){
                head.next = null;
                return head;
            }
            if(n == 2){
                return head.next;
            }
        }

        var slow = head;
        var fast = head;
        for (int i = 0; i < n - 1; i++)
            fast = fast.next;
        var prev = slow;

        if(fast.next == null) return head.next;
        while(fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }
        var next = slow.next;
        slow.next = null;
        prev.next = next;

        return head;
    }
}