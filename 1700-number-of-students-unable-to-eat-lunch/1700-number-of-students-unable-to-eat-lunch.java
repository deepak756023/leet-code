class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < students.length; i++) {
            stack.push(sandwiches[students.length - i - 1]);
            queue.add(students[i]);
        }

        while(stack.size()>0 && queue.contains(stack.peek())){
            int student = queue.poll();
            if(student == stack.peek()){
                stack.pop();
            } else {
                queue.add(student);
            }
        }
        return queue.size();

    }
}