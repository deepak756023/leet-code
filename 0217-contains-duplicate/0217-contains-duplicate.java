class Solution {
    public boolean containsDuplicate(int[] nums) {
        Long distLength = Arrays.stream(nums)
              .distinct()
              .count();
        if(distLength == nums.length){
            return false;
        }else{
           return true; 
        }
        
    }
}