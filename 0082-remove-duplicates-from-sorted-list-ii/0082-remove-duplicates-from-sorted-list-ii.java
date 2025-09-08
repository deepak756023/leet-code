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
        if(head == null || head.next == null){
            return head;
        }

        ListNode dummy = new ListNode(0, head);

        var prev = dummy;
        var curr = dummy.next;
        var nxt = curr.next;
        boolean isMatch = false;

        while(nxt != null){
            if(curr.val == nxt.val){
                if(nxt.next != null){
                    nxt = nxt.next;
                isMatch = true;
                continue;

                }else{
                    prev.next = null;
                    break;
                }
                
            }

            if(isMatch && curr.val != nxt.val){
                prev.next = nxt;
                curr = prev.next;
                nxt = curr.next;
                isMatch = false;
                continue;
            }

            if(!isMatch && curr.val != nxt.val){
                prev = curr;
                curr = nxt;
                nxt = nxt.next;
            }
        }



        return dummy.next;
        
    }
}