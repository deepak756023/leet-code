class Solution {
    public int compress(char[] chars) {
        int start = 0;
        int pos = 0;

        while (start < chars.length) {
            char current = chars[start];
            int count = 0;

            while (start < chars.length && chars[start] == current) {
                start++;
                count++;
            }
            chars[pos++] = current;

            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[pos++] = c;
                }
            }
        }

        return pos;
    }
}
