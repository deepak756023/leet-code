class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0;
        int odd = 1;

        while(odd < nums.length && even < nums.length){
            if(nums[even] % 2 == 0){
                even = even + 2;
                continue;
            }
            if(nums[odd] % 2 == 1){
                odd = odd + 2;
                continue;
            }
            int temp = nums[even];
            nums[even] = nums[odd];
            nums[odd] = temp; 
            even = even + 2;
            odd = odd + 2;

        }
        return nums;
    }
}