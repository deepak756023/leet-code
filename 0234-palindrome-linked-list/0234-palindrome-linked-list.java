class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) 
            return true;

        // 1. Find middle of the list (slow will stop at middle)
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse the second half of the list
        ListNode secondHalf = reverseList(slow);

        // 3. Compare first and second halves
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        boolean isPalin = true;
        while (p2 != null) {
            if (p1.val != p2.val) {
                isPalin = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 4. (Optional) Restore list to original form
        reverseList(secondHalf);

        return isPalin;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
