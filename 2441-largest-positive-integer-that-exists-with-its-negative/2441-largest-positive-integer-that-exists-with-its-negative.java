class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(var num : nums){
            set.add(num);
        }

        int max = -1;
        for(int i = 0; i < nums.length; i++){
            if(max < nums[i]){
                if(set.contains(-nums[i])){
                    max = nums[i];
                }
            }
        }

        return max;
        
    }
}