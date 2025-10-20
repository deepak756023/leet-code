class Solution {
    public String reverseWords(String s) {
        String op = "";
        int start = 0;
        int next = 1;
        int length = s.length();

        while (next < length) {
            if (s.charAt(next) == ' ') {
                op = op + reverse(s.substring(start, next)) + " ";
                start = next + 1;
                next = start + 1;
            }
            if (next == length - 1) {
                op = op + reverse(s.substring(start, next + 1));
            }
            next++;
        }
        return op;
    }

    private String reverse(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}