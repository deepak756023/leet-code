class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> queue = new ArrayDeque<>();
        Arrays.sort(deck);
        int len = deck.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            queue.add(i);
        }
        int i = 0;
        while (!queue.isEmpty()) {
            int top = queue.remove();
            if(!queue.isEmpty()) {
                int secondTop = queue.remove();
                queue.add(secondTop);
            }
            result[top] = deck[i];
            i++;
        }

        return result;

    }
}