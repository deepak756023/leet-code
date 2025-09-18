class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
       
        for (var ch : s.toCharArray()) {
            
            if (!stack.empty() && ch == stack.peek()) {
                stack.pop();
            } 
            else
                stack.push(ch);

        }

        StringBuilder distinct = new StringBuilder();
        while (!stack.empty()) {
            distinct.append(stack.pop());
        }
        return distinct.reverse().toString();

    }
}