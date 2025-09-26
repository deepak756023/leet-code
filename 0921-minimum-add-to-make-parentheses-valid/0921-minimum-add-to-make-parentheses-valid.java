class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (var ch : s.toCharArray()) {
            if (ch == '(') {
                if(stack.isEmpty()){
                    stack.push(ch);
                    continue;
                }
                stack.push(ch);
            }
            if (ch == ')') {
                
                if(stack.isEmpty() || stack.peek() == ')'){
                    stack.push(ch);
                    continue;
                }
                
                stack.pop();
            }
        }
        return stack.size();
    }
}