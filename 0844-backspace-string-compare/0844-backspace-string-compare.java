class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();

        for (var ch : s.toCharArray()) {
            if (ch == '#') {
                if (!stack1.isEmpty())
                    stack1.pop();
                continue;
            }
            stack1.push(ch);
        }

        for (var ch : t.toCharArray()) {
            if (ch == '#') {
                if (!stack2.isEmpty())
                    stack2.pop();
                continue;
            }
            stack2.push(ch);
        }

        if (stack1.size() != stack2.size())
            return false;

        while (!stack1.isEmpty()) {
            if (stack1.pop() != stack2.pop())
                return false;
        }

        return true;

    }
}