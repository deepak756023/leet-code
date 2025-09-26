class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < temperatures.length; i++){
            int num = temperatures[i];
            while(!stack.isEmpty() &&  temperatures[stack.peek()] < num){
                int idx = stack.pop();
                map.put(idx, i - idx);
            }
            stack.push(i);
        }
        int res[] = new int[temperatures.length];
         for(int i = 0; i < temperatures.length; i++){
            res[i] = map.getOrDefault(i, 0);
         }

        return res;
    }
}