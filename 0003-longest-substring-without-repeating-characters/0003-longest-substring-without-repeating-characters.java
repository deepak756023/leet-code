class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len = s.length();
        if (len <= 1) return len;

        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < len; right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
