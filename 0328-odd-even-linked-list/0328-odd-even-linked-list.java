class Solution {
    public ListNode oddEvenList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null) return head;

        var prev = head;
        var curr = head.next;
        var prevOfCurr = head;   // <-- new pointer to track node before curr
        int count = 1;

        while (curr != null) {
            if (count % 2 == 0) {
                var temp1 = prev.next;   // node after prev
                var temp2 = curr.next;   // node after curr

                prev.next = curr;        // link prev → curr
                curr.next = temp1;       // link curr → old next

                prevOfCurr.next = temp2; // reconnect previous-of-curr → temp2

                prev = prev.next;
                curr = temp2;
                count++;
                continue;
            }

            // advance normally
            prevOfCurr = curr;
            curr = curr.next;
            count++;
        }

        return head;
    }
}
