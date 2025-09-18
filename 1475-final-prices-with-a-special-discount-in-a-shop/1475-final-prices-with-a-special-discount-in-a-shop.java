class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < prices.length; i++) {
            int num = prices[i];
            int j = i;
            while (!stack.empty() && num <= stack.peek()) {
                j = j - 1;
                stack.pop();
                while (map.containsKey(j))
                    j--;
                map.put(j, num);
            }
            stack.push(num);
        }

        for (int i = 0; i < prices.length; i++) {
            int discount = map.getOrDefault(i, 0);
            prices[i] -= discount;
        }
        return prices;
    }
}