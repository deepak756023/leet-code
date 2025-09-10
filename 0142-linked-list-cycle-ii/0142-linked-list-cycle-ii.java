
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> nodes = new HashSet<>();

        if (head == null || head.next == null)
            return null;

        var slow = head;
        var fast = head;

        while (fast.next != null && fast.next.next != null) {
            nodes.add(slow);
            slow = slow.next;
            fast = fast.next.next;
            if (nodes.contains(fast)) {
                return fast;
            }
        }

        return null;

    }
}