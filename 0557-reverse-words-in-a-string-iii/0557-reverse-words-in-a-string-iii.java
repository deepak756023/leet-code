class Solution {
    public String reverseWords(String s) {
        StringBuilder rev = new StringBuilder();
        int start = 0;
        int next = 0;
        int length = s.length();

        while (next < length) {
            if (s.charAt(next) == ' ') {
                rev = rev.append(reverse(s.substring(start, next)) + " ") ;
                start = next + 1;
                next = start;
            }
            if (next == length - 1) {
                rev = rev.append(reverse(s.substring(start, next + 1)));
            }
            next++;
        }
        return rev.toString();
    }

    private String reverse(String word) {
        // char[] chars = word.toCharArray();
        // int start = 0;
        // int end = chars.length - 1;
        // while (start < end) {
        //     char temp = chars[start];
        //     chars[start] = chars[end];
        //     chars[end] = temp;
        //     start++;
        //     end--;
        // }
        // return new String(chars);
        return new StringBuilder(word).reverse().toString();
    }
}