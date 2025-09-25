class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = asteroids.length - 1; i >= 0; i--) {
            int curr = asteroids[i];
            while (!stack.isEmpty() && stack.peek() < 0 && curr > 0) {
                int top = stack.peek();
                if (Math.abs(top) == Math.abs(curr)) {
                    stack.pop();
                    curr = 0;
                    break;
                } else if (Math.abs(top) > Math.abs(curr)) {
                    curr = 0;
                    break;
                } else {
                    stack.pop();
                }
            }
            if (curr != 0) {
                stack.push(curr);
            }
        }
        int[] res = new int[stack.size()];
        int j = 0;
        while (!stack.empty()) {
            res[j++] = stack.pop();
        }
        return res;
    }
}
