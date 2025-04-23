class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int[] distinctSorted = Arrays.stream(nums).distinct().toArray();
        int[] result = new int[2];
        int n = nums.length;
        int m = distinctSorted.length;
        int ommit = m + 1;
        for(int i = 0; i < m; i++){
            if(distinctSorted[i] != i+1){
                ommit = i + 1;
                break;
            }
        }
        int same = 0;
        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                same = nums[i];
            }
        }
        result[0] = same;
        result[1] = ommit;
        return result;
        
    }
}
