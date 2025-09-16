class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (var ch : chars) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                continue;
            }
            if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.empty())
                    return false;
                char top = stack.pop();
                if (ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '[') {

                } else {
                    return false;
                }
            }

        }

        return stack.empty();
    }
}