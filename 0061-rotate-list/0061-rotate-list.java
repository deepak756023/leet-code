
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null || k == 0) return head;

        var slow = head;
        var fast = head;

        for(int i = 0; i < k; i++){
            if(fast.next == null){
                fast = head;
                continue;
            }
            fast = fast.next;
        }

        if(slow == fast) return head;

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        var temp = slow.next;
        var newHead = temp;
        var current = newHead;
        slow.next = null;

        while(current.next != null){
            current = current.next;
        }

        // return current;

        current.next = head;
        return newHead;

        
    }
}
