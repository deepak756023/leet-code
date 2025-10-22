class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(var num : nums){
            set.add(num);
        }

        for(int i = 0; i < nums.length; i++){
            int temp1 = nums[i] + diff;
            if(!set.contains(temp1)){
                continue;
            }else{
                int temp2 = temp1 + diff;
                if(!set.contains(temp2)){
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