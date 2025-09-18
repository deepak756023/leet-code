class Solution {
    public String makeGood(String s) {
        if (s.length() < 2) {
            return s;
        }

        Stack<Character> stack = new Stack<>();

        for(var ch : s.toCharArray()){
            if(!stack.empty()){
                if(Math.abs(ch - (stack.peek())) == 32){
                    stack.pop();
                    continue;
                }
               
            }
             stack.push(ch);
        }

        StringBuilder ans = new StringBuilder();
        for (char currChar : stack) 
            ans.append(currChar);
        return ans.toString();
    }
}