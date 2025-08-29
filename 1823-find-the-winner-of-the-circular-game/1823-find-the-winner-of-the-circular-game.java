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
        ArrayList<Integer> circle = new ArrayList<>();
        for (int i = 1; i <= n; ++i) {
            circle.add(i);
        }
        int cur_ind = 0;

        while (circle.size() > 1) {
            int next_to_remove = (cur_ind + k - 1) % circle.size();
            circle.remove(next_to_remove);
            cur_ind = next_to_remove;
        }

        return circle.get(0);
    }
}