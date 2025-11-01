class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;

        for (int p = 0; p < len - 3; p++) {
            if (p > 0 && nums[p] == nums[p - 1])
                continue;

            for (int q = p + 1; q < len - 2; q++) {
                if (q > p + 1 && nums[q] == nums[q - 1])
                    continue;

                int r = q + 1;
                int s = len - 1;
                while(r < s){
                    long sum = (long)nums[p] + nums[q] + nums[r] + nums[s];
                    if(sum < target){
                        r++;
                    }else if(sum > target){
                        s--;
                    }else{
                        result.add(List.of(nums[p] , nums[q] , nums[r] , nums[s]));
                        r++;

                        while(nums[r] == nums[r - 1] && r < s){
                            r++;
                        }
                    }
                }

            }
        }
        return result;
    }
}