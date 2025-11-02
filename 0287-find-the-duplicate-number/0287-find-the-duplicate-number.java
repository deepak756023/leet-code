class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        for(var num : nums){
            int val = map.containsKey(num) ? map.get(num) + 1 : 1;
            map.put(num, val);
        }

        for(var key : map.keySet()){
            if(map.get(key) > 1){
                return key;
            }
        }

        return -1;
        
    }
}