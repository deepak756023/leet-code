class Solution {
    public String makeGood(String s) {
        if (s.length() < 2) {
            return s;
        }
        
        Stack<Character> stack = new Stack<>();

        for(var ch : s.toCharArray()){
            if(!stack.empty()){
                if(Math.abs((int)ch - ((int)stack.peek())) == 32){
                    stack.pop();
                    continue;
                }
               
            }
             stack.push(ch);
        }

        StringBuilder good = new StringBuilder();
        while(!stack.empty()){
            good.insert(0, stack.pop());
        }

        return good.toString();
    }
}