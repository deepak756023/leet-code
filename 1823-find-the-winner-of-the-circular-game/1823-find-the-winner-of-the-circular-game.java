class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        int i = 1;
        while (i <= n) {
            queue.add(i);
            i++;
        }
        int front = 0;
        int count = 1;
        while (!queue.isEmpty()) {

            front = queue.remove();
            if (count % k == 0) {

            } else {
                queue.add(front);
            }
            count++;

        }
        return front;

    }
}


