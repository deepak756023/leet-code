class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Set<Integer> set = new HashSet<>();

        for (var arr : arr2)
            set.add(arr);

        int count = 0;

        for (int i = 0; i < arr1.length; i++) {
            int diff = d;
            while (diff >= 0) {
                if (set.contains(arr1[i] + diff) || set.contains(arr1[i] - diff)) {
                    count++;
                    break;
                }
                diff--;

            }
        }

        return arr1.length - count;

    }
}