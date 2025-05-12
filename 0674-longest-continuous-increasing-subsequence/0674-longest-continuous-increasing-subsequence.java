class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int count = 1;
        int max = 1;
        int left = 0;
        int right =  1;
        while(right < nums.length){
            
            if(nums[left] < nums[right]){
                count++;
                right++;
                left++;
            }else{
                left = right;
                right = left + 1;
                count = 1;
                
            }
            if(count > max){
                    max = count;
            }

        }
        return max;
        
    }
}