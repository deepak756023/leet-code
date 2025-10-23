class Solution {
    public String makeSmallestPalindrome(String s) {
        int len = s.length();
        int left = 0;
        int right = len - 1;
        char[] chars = s.toCharArray();

        while (left < right) {
            if (chars[left] != chars[right]) {
                if (chars[left] < chars[right]) {
                    chars[right] = chars[left];
                } else {
                    chars[left] = chars[right];
                }
            } 
            left++;
            right--;

        }
        return new String(chars);

    }
}