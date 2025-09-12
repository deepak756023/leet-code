class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) return head;

        var prev = head;
        var curr = head.next;
        var prevOfCurr = head;
        int count = 1;

        while (curr != null) {
            if (count % 2 == 0) {
                var temp1 = prev.next;
                var temp2 = curr.next;   

                prev.next = curr;        
                curr.next = temp1;      

                prevOfCurr.next = temp2; 

                prev = prev.next;
                curr = temp2;
                count++;
                continue;
            }

           
            prevOfCurr = curr;
            curr = curr.next;
            count++;
        }

        return head;
    }
}
