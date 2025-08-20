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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null || head.next.next ==null) return;

        //             ------------------------- Brute Force ----------------------------
        // Stack<ListNode> stack = new Stack<>();
        // var stackCurrent = head;
        // int count = 0;
        // while(stackCurrent != null){
        //     stack.push(stackCurrent);
        //     stackCurrent = stackCurrent.next;
        //     count++;
        // }

        // int iteration = 1;
        // var current = head;
        // while(iteration != ((count + 1) / 2)){
        //     var stackNode = stack.pop();
        //     var temp = current.next;
        //     current.next = stackNode;
        //     stackNode.next = temp;

        //     current = temp;
        //     iteration++;
        // }

        // if(count % 2 != 0){
        //     current.next = null;
        // }else{
        //     current.next.next = null;
        // }

        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // reversing list after the half part
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null;
        while(curr!=null){
            ListNode front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }
        
        // merging two halves
        ListNode h1=head, h2=prev;
        while(h2!=null){
            ListNode t1 = h1.next;
            ListNode t2 = h2.next;
            h1.next = h2;
            h2.next = t1;

            h1 = t1;
            h2 = t2;
        }



        
    }
}