class Solution {
    public String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for(var ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                if(!stack.empty()){
                    stack.pop();
                    continue;
                }
            }
            stack.push(ch);
        }

        StringBuilder str = new StringBuilder();
        while(!stack.empty()){
            str.append(stack.pop());
        }
        return str.reverse().toString();
    }
}