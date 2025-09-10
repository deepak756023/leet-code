
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       var dummy = new ListNode(0, head);
       var prev = dummy;

       for(int i = 0; i < left - 1; i++){
        prev = prev.next;
       }

       var curr = prev.next;
       var latter = curr.next;

       for(int i = 0; i < right - left; i++){
        var temp = latter.next;
        latter.next = prev.next;
        curr.next = temp;
        prev.next = latter;

        
        latter = temp;
       }

       return dummy.next;

    }
}