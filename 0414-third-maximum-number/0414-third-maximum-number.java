class Solution {
    public int thirdMax(int[] nums) {
        int l = (int)Arrays.stream(nums)
                      .distinct()
                      .count();
        if(l < 3){
            int max = nums[0];
            for(int i = 1 ; i < nums.length ; i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
        return max;
        }else{
            int[] distinct = Arrays.stream(nums)
                .distinct()
                .toArray();
            Arrays.sort(distinct);
            return distinct[distinct.length -3];

        }
        
    }
}