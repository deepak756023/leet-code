class Solution {
    public int[] nextLargerNodes(ListNode head) {
        // Step 1: convert linked list to array for easy index access
        List<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        int n = values.size();
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // store indices

        // Step 2: iterate through values
        for (int i = 0; i < n; i++) {
            // while current value is greater than value at index on stack
            while (!stack.isEmpty() && values.get(stack.peek()) < values.get(i)) {
                result[stack.pop()] = values.get(i);
            }
            stack.push(i);
        }

        return result;
    }
}
