class Solution {
    public int arrayPairSum(int[] nums) {
        int i = 0;
        int sum = 0;
        Arrays.sort(nums);
        while(i < nums.length){
            sum += Math.min(nums[i], nums[i++]);
            i++;
        }
        return sum;
    }
}