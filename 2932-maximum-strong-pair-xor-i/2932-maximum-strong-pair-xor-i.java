class Solution {
    public int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int xorValue = 0;
        int max = 0;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                xorValue = nums[i] ^ nums[j];

                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j]))
                    if (max < xorValue)
                        max = xorValue;

            }

        }
        return max;

    }
}