class MyStack {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();

    public MyStack() {

    }

    public void push(int x) {
        queue1.add(x);

    }

    public int pop() {
        int top = 0;
        while (!queue1.isEmpty()) {
             top = queue1.remove();
            if (!queue1.isEmpty())
                queue2.add(top);
        }
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;

    }

    public int top() {
        int top = 0;
        while (!queue1.isEmpty()) {
             top = queue1.remove();
            queue2.add(top);
        }
        var temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return top;

    }

    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */