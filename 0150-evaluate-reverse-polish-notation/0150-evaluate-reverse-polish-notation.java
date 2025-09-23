class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isOperator(tokens[i])) {
                int right = stack.pop();
                int left = stack.pop();
                int result = operation(left, right, tokens[i]);
                stack.push(result);

            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();

    }

    private boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("/") || s.equals("*");
    }

    private int operation(int left, int right, String operand) {
        switch (operand) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operand);
        }

    }
}