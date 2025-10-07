class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] charArray = s.toCharArray();

        for (var ch : charArray) {
            var count = map.containsKey(ch) ? map.get(ch) + 1 : 1;
            map.put(ch, count);
        }
        for (var ch : charArray) {
            if (map.get(ch) == 1)
                return s.indexOf(ch);
        }

        return -1;
        
    }
}