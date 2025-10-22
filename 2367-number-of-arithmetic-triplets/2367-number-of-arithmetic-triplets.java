class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(var num : nums){
            set.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i] + diff)){
                continue;
            }else{
                if(!set.contains(nums[i] + 2 * diff)){
                    continue;
                }else{
                    set.remove(nums[i]);
                    count++;
                }
            }
        }

        return count;
        
    }
}