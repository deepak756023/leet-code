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

        Stack<ListNode> stack = new Stack<>();
        var stackCurrent = head;
        int count = 0;
        while(stackCurrent != null){
            stack.push(stackCurrent);
            stackCurrent = stackCurrent.next;
            count++;
        }

        int iteration = 1;
        var current = head;
        while(iteration != ((count + 1) / 2)){
            var stackNode = stack.pop();
            var temp = current.next;
            current.next = stackNode;
            stackNode.next = temp;

            current = temp;
            iteration++;
        }

        if(count % 2 != 0){
            current.next = null;
        }else{
            current.next.next = null;
        }
        
    }
}