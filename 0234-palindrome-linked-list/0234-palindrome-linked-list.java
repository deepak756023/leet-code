class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        //finding the middle node
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode curr = (fast == null) ? slow : slow.next;

        //InPlace revrsal
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        //checking the first half with second
        ListNode p1 = head;
        ListNode p2 = prev;

        while (p2 != null) {
            if (p1.val != p2.val)
                return false;
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}