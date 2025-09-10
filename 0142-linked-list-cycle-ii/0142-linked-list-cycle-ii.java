public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();
        ListNode curr = head;

        while (curr != null) {
            if (seen.contains(curr)) {
                return curr;  // cycle entry
            }
            seen.add(curr);
            curr = curr.next;
        }

        return null;  // no cycle
    }
}
