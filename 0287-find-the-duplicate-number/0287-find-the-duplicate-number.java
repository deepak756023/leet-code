class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int slow = 0;
        int fast = 1;
        while(fast < len){
            if(nums[slow] == nums[fast]){
                return nums[slow];
            }
            slow++;
            fast++;
        }
        return -1;
       
        
    }
}