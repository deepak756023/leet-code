class Solution {
    public double minimumAverage(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        int left = 0;
        int right = len - 1;
        double min = 9999999;

        while (left < right) {
            double res = (nums[left] + nums[right]) / 2.0;
            if(min > res){
                min = res;
            }
            left++;
            right--;
        }
        return min;

    }
}
