class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder str = new StringBuilder();

        if (word.contains(String.valueOf(ch))) {
            int index = word.indexOf(String.valueOf(ch));
            str.append(word.substring(0, index + 1));

            return str.reverse().toString().concat(word.substring(index + 1));
        }
        return word;

    }
}