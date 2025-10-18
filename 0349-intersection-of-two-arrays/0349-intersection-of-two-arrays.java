class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set2 = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toSet());
                
        return Arrays.stream(nums1)
                .distinct()
                .filter(set2::contains)
                .toArray();
    }

}