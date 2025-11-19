class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length() < 3) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
        int last = 2;
        int count = 0;

        for(int i = 0; i <= last; i++){
            char ch = s.charAt(i);
            int val = map.containsKey(ch) ? map.get(ch) + 1 : 1;
            map.put(ch, val);
        }

        while(last < s.length()){
            if(map.size() == 3){
                count++;
            }
            if(last == s.length() - 1){
                break;
            }
            char c = s.charAt(start);
            int val = map.get(c);
            if(val == 1){
                map.remove(c);
            }else{
                map.put(c, val - 1);
            }
            char n = s.charAt(last + 1);
            int value = map.containsKey(n) ? map.get(n) + 1 : 1;
            map.put(n, value);

            start++;
            last++;
        }

        return count;
        
    }
}