class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int num:nums1){
            set.add(num);
        }

        HashSet<Integer> resultSet = new HashSet<>();

        for(int num:nums2){
            if(set.contains(num)) resultSet.add(num);
        }  

        int[] arr = new int[resultSet.size()];
        int i=0;
        for(int num:resultSet){
            arr[i++]=num;
        } 

        return arr;     
    }
}