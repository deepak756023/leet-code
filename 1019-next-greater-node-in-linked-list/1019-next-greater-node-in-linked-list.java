class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // Step 1: Find length
        int length = 0;
        ListNode curr = head;
        while (curr != null) {
            length++;
            curr = curr.next;
        }

        // Step 2: Copy values into an array
        int[] arr = new int[length];
        curr = head;
        for (int i = 0; i < length; i++) {
            arr[i] = curr.val;
            curr = curr.next;
        }

        // Step 3: Apply NGE algorithm
        int[] result = new int[length];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                result[stack.pop()] = arr[i];
            }
            stack.push(i);
        }

        // Remaining indices automatically have result = 0
        return result;
    }
}
