
// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         var curr1 = l1;
//         var curr2 = l2;
//         Stack<Integer> stack1 = new Stack<>();
//         Stack<Integer> stack2 = new Stack<>();
//         int carry = 0;

//         while (curr1 != null || curr2 != null) {
//             if (curr1 == null) {
//                 stack2.push(curr2.val);
//                 curr2 = curr2.next;
//                 continue;
//             }
//             if (curr2 == null) {
//                 stack1.push(curr1.val);
//                 curr1 = curr1.next;
//                 continue;
//             }
//             stack1.push(curr1.val);
//             stack2.push(curr2.val);
//             curr1 = curr1.next;
//             curr2 = curr2.next;
//         }
//         ListNode dummy = new ListNode(0);
//         var first = dummy.next;

//         while (!stack1.isEmpty() || !stack2.isEmpty() || carry != 0) {
//             int x = stack1.isEmpty() ? 0 : stack1.pop();
//             int y = stack2.isEmpty() ? 0 : stack2.pop();
//             int sum = x + y + carry;

//             var curr = new ListNode(sum % 10);
//             dummy.next = curr;
//             curr.next = first;

//             first = dummy.next;

//             carry = sum / 10;

//         }

//         return dummy.next;

//     }
// }

class Solution {
    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            int ld = sum % 10;
            t.next = new ListNode(ld);
            t = t.next;
        }
        return reverse(dummy.next);
    }
}
