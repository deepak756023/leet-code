class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        var slow = head;
        var fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        var newHead = new ListNode(slow.next.val);

        var current = slow.next.next;
        while (current != null) {
            ListNode NL = new ListNode(current.val);
            NL.next = newHead;
            newHead = NL;
            current = current.next;

        }
        while (newHead != null) {
            if (newHead.val != head.val) {
                return false;
            }
            newHead = newHead.next;
            head = head.next;
        }
        return true;
    }
}