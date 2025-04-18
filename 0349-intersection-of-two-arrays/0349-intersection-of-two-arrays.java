class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
         return Arrays.stream(nums1)
                 .distinct()
                 .filter(x -> Arrays.stream(nums2).anyMatch(y -> y == x))
                 .toArray();
    }
}