// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         for(int i = 0; i < nums1.length; i++){
//             for(int j = 0; j < nums2.length; j++){
//                 if(nums1[i] == nums2[j]){
//                     if(j != nums2.length-1 && nums1[i] < nums2[j+1]){
//                         nums1[i] = nums2[j+1];
//                     }else{
//                         nums1[i] = -1;
//                     }
//                 }
//             }
//         }
//         return nums1;
//     }
// }

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    index = j;
                    break;
                }
            }
            int nextGreater = -1;
            for (int j = index + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }
}
