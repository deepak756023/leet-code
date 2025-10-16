class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
        int left = 0, right = n - 1;
        int result = 0;
        
        while (left < right) {
            int currArea = Math.min(height[left], height[right]) * (right - left);
                        result = Math.max(result, currArea);
            
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }
}