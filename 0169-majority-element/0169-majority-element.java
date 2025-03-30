class Solution {
    public int majorityElement(int[] nums) {
        int number = 0;

        for (int j = 0; j < nums.length; j++) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                number =  nums[j];
            }
        }
        return number;
    }
}

