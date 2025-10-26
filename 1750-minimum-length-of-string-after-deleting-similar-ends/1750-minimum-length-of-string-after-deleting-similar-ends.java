class Solution {
    public int minimumLength(String s) {
        int start = 0;
        int end = s.length() - 1;

        // Continue trimming from both sides while the characters match
        while (start < end && s.charAt(start) == s.charAt(end)) {
            char ch = s.charAt(start);

            // Move start pointer forward while the same char continues
            while (start <= end && s.charAt(start) == ch) {
                start++;
            }

            // Move end pointer backward while the same char continues
            while (end >= start && s.charAt(end) == ch) {
                end--;
            }
        }

        // Remaining substring length
        return end - start + 1;
    }
}
