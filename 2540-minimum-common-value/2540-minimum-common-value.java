class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int first = 0;
        int second = 0;

        int len1 = nums1.length;
        int len2 = nums2.length;

        while(first < len1 && second < len2){
            if(nums1[first] == nums2[second]){
                return nums1[first];
            }else if(nums1[first] < nums2[second]){
                first++;
            }else{
                second++;
            }
        }
        return -1;
        
    }
}