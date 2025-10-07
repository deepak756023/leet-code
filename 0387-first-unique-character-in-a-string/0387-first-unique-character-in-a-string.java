class Solution {
    public int firstUniqChar(String s) {

        Map<Character, Integer> map = new HashMap<>();
        for(var ch : s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch) + 1);
                continue;
            }
            map.put(ch, 1);

        }

        for(var ch : s.toCharArray()){
            if(map.get(ch) == 1){
                return s.indexOf(ch);
            }
        }

        return -1; 
        
    }
}