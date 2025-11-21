class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length == 1) return 0;
        Arrays.sort(nums);
        int min = 99999;
        int max = 0;
        int minDiff = 0;
        
        min = nums[0];
        max = nums[k - 1];
        minDiff = max - min;
        for(int i = k; i < nums.length; i++){
            max = nums[i];
            min = nums[i - k + 1];
            int diff = max - min;
            if(minDiff > diff){
                minDiff = diff;
            }
            
        }
        return minDiff;

        
    }
}