class Solution {
    public String makeGood(String s) {
        if (s.length() < 2) {
            return s;
        }
        
        Stack<Character> stack = new Stack<>();
        for (char currChar : s.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - currChar) == 32) {
                stack.pop();
            } else {
                stack.push(currChar);
            }
        }
        
        StringBuilder ans = new StringBuilder();
        for (char currChar : stack) 
            ans.append(currChar);
        return ans.toString();
    }
}