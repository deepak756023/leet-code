class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();//<Index, greaterNumber>
        Stack<Integer> stack = new Stack<>();//<Index>
        int len = nums.length;

        for (int i = 0; i < 2 * len; i++) {
            int j = i % len;
            int num = nums[j];

            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                int idx = stack.pop();
                map.put(idx, num);
            }

            if (!map.containsKey(j)) {
                stack.push(j);
            }
        }

        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            result[i] = map.getOrDefault(i, -1);
        }
        return result;
    }
}
