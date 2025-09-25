class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        int len = nums.length;

        for (int i = 0; i < 2 * len; i++) {
            int j = i % len;
            int num = nums[j];

            // check against indices stored in stack
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int idx = stack.pop();
                map.put(idx, num); // store next greater for index idx
            }

            if (!map.containsKey(j)) {
                stack.push(j); // push index, not value
            }
        }

        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = map.getOrDefault(i, -1);
        }
        return result;
    }
}
