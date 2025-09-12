
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var curr1 = l1;
        var curr2 = l2;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        int carry = 0;

        while (curr1 != null || curr2 != null) {
            if (curr1 == null) {
                stack2.push(curr2.val);
                curr2 = curr2.next;
                continue;
            }
            if (curr2 == null) {
                stack1.push(curr1.val);
                curr1 = curr1.next;
                continue;
            }
            stack1.push(curr1.val);
            stack2.push(curr2.val);
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        ListNode dummy = new ListNode(0);
        var first = dummy.next;

        while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
            int x = stack1.isEmpty() ? 0 : stack1.pop();
            int y = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = x + y + carry;

            var curr = new ListNode(sum % 10);
            dummy.next = curr;
            curr.next = first;

            first = dummy.next;

            carry = sum / 10;

        }

        return dummy.next;

    }
}
