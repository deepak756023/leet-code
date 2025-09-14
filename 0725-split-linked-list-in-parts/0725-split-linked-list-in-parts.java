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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] nodes = new ListNode[k];
        int N = 0;
        var current = head;
        while (current != null) {
            current = current.next;
            N++;
        }

        int eachGet = N / k;
        int getsOneExtra = N % k;

        int count = 0;

        while (count < k) {
            var dummy = new ListNode(0, head);
            var curr = dummy;
            int i = 0;
            while (i < eachGet && curr.next != null) {
                curr = curr.next;
                i++;

            }
            if (curr.next == null) {
                nodes[count] = dummy.next;
                break;
            }
            if (getsOneExtra > 0) {
                curr = curr.next;
                getsOneExtra--;
            }
            var temp = curr.next;
            curr.next = null;
            nodes[count] = dummy.next;
            head = temp;
            count++;
        }

        return nodes;

    }
}