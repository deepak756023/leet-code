class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < students.length; i++) {
            stack.push(sandwiches[students.length - i - 1]);
            queue.add(students[i]);
        }

        while (!stack.empty()) {
            if (isAllNotWantTop(stack.peek(), queue)) {
                return stack.size();
            }
            int topStudent = queue.remove();
            int topSandWich = stack.pop();
            if (topStudent != topSandWich) {
                queue.add(topStudent);
                stack.push(topSandWich);
            }
        }
        return 0;

    }

    public boolean isAllNotWantTop(int top, Queue<Integer> queue){
        boolean allSame = queue.stream().distinct().count() == 1;
        if(top != queue.peek() && allSame){
            return true;
        }
        return false;
    }
}