class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        
        int left = 0, right = n - 1;
        int result = 0;
        
        while (left < right) {
            // Select the minimum of left and right heights and calculate area
            int currArea = Math.min(height[left], height[right]) * (right - left);
            
            // Update result if current area is greater than max area calculated so far
            result = Math.max(result, currArea);
            
            // If left height is less than right height, discard left height
            // Else discard right height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        
        return result;
    }
}