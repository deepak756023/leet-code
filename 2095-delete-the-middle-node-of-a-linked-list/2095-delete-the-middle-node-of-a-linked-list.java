class Solution {
    public ListNode deleteMiddle(ListNode head) {
       if(head.next == null) return null;

       if(head.next.next == null){
        head.next = null;
        return head;
       }

       ListNode mid = findMid(head);
       mid.val = mid.next.val;
       mid.next = mid.next.next;

       return head; 
    }

    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}