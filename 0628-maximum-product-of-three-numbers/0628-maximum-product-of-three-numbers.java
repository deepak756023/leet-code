class Solution {
    public int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        if((nums[len - 1] * nums[len - 2] * nums[len - 3]) > (nums[0] * nums[1] * nums[len -1]))
        {
            return nums[len - 1] * nums[len - 2] * nums[len - 3];
        }else{
            return nums[0] * nums[1] * nums[len -1];
        }
        

        
    }
}