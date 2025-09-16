class MyQueue {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        stack1.push(x);

    }

    public int pop() {
        int top = 0;
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        top = stack2.pop();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return top;

    }

    public int peek() {
        int top = 0;
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }
        top = stack2.peek();
        while(!stack2.empty()){
            stack1.push(stack2.pop());
        }
        return top;
    }

    public boolean empty() {
        return stack1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */