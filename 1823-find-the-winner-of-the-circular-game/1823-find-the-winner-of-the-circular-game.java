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
        int winner = 0; // J(1, k) = 0 (0-indexed)
        for (int i = 2; i <= n; i++) {
            winner = (winner + k) % i;
        }
        return winner + 1; // convert to 1-indexed
    }
}
