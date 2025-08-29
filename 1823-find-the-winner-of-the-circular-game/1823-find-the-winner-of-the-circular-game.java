// class Solution {
//     public int findTheWinner(int n, int k) {
//         Queue<Integer> queue = new ArrayDeque<>();
//         int i = 1;
//         while (i <= n) {
//             queue.add(i);
//             i++;
//         }
//         int front = 0;
//         int count = 1;
//         while (!queue.isEmpty()) {

//             front = queue.remove();
//             if (count % k == 0) {

//             } else {
//                 queue.add(front);
//             }
//             count++;

//         }
//         return front;

//     }
// }

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        
        while (queue.size() > 1) {
            // Rotate (k-1) times efficiently
            for (int i = 1; i < k; i++) {
                queue.add(queue.remove()); // move front to back
            }
            queue.remove(); // eliminate the k-th person
        }
        
        return queue.peek(); // last winner
    }
}

