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
    public int getDecimalValue(ListNode head) {

        var current = head;
        var temp = head;
        int count = 0;
        int output = 0;
        while(current != null){
            count++;
            current = current.next;

        }
        while(temp != null){
            output += (temp.val) * Math.pow(2, count - 1);
            count--;
            temp = temp.next;

        }
        return output;
    }
}