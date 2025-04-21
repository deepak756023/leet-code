class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int count = list1.length + list2.length;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (count > i + j) {
                        map.clear();
                        map.put(list1[i], i + j);
                        count = i + j;
                    } else if (count == i + j) {
                        map.put(list1[i], i + j);
                    }
                }
            }
        }
        String[] keys = map.keySet().toArray(new String[0]);
        return keys;
    }
}
