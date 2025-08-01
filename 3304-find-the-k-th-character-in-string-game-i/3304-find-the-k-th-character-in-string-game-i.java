class Solution {
    public char kthCharacter(int k) {
        StringBuffer word = new StringBuffer("a");

        while (word.length() < k) {
            // .toString().toCharArray() creates a snapshot, so even though you're appending inside the loop, the current iteration is unaffected — you're not looping over newly added characters.
            for (var ch : word.toString().toCharArray()) {
                var next = (char) (ch + 1);
                word.append(next);
            }

        }

        return word.charAt(k - 1);
    }
}