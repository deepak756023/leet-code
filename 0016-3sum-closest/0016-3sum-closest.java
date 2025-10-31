class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int len = nums.length;
        int closest = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < len - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = len - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int absDiff = Math.abs(target - sum);

                if (Math.abs(target - closest) > absDiff) {
                    closest = sum;
                }

                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else {
                    return sum;
                }
            }
        }
        return closest;
    }
}
