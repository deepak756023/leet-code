class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        
        int max = 0;
        for(var ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
            }
            if(ch == ')'){
                int size = stack.size();
                if(size > max)
                max = size;

                stack.pop();
            }
        }
        return max;
        
    }
}