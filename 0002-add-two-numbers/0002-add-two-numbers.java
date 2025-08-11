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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Long first = (long)0;
        Long second = (long)0;
        int i = 0, j = 0;
        while (l1 != null) {
            first = first + (long) Math.pow(10, i) * l1.val;
            i++;
            l1 = l1.next;
        }
        while (l2 != null) {
            second = second + (long)Math.pow(10, j) * l2.val;
            j++;
            l2 = l2.next;
        }
        Long number = first + second;
        ListNode sum = new ListNode(-1);
        ListNode dummy = sum;

        if (number == 0) {
            return new ListNode(0);
        }

        while (number > 0) {
            long rem = number % 10;
            dummy.next = new ListNode((int)rem); // create node
            dummy = dummy.next;
            number /= 10;
        }

        return sum.next;

    }
}