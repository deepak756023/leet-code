// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int len = s1.length();
//         HashMap<Character, Integer> maps1 = new HashMap<>();
//         HashMap<Character, Integer> maps2 = new HashMap<>();

//         for(var ch : s1.toCharArray()){
//             int value = maps1.containsKey(ch) ? maps1.get(ch) + 1 : 1;
//             maps1.put(ch, value);
//         }

//         int start = 0;
//         int end = len;

//         while(end <= s2.length()){
//             createHashMaps2(s2.substring(start, end), maps2);
//             if(maps1.equals(maps2)){
//                 return true;
//             }
//             maps2.clear();
//             start++;
//             end++;

//         }
//         return false;  

        
//     }

//     private void createHashMaps2(String str, HashMap<Character, Integer> maps2){
//         for(var ch : str.toCharArray()){
//             int count = maps2.containsKey(ch) ? maps2.get(ch)+1 : 1;
//             maps2.put(ch, count);
//         }
//     }
// }

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        // Count frequency for s1
        for (char c : s1.toCharArray()) {
            s1Count[c - 'a']++;
        }

        int k = s1.length();

        for (int i = 0; i < s2.length(); i++) {
            s2Count[s2.charAt(i) - 'a']++;

            // Keep window size equal to s1
            if (i >= k) {
                s2Count[s2.charAt(i - k) - 'a']--;
            }

            // Compare frequencies
            if (Arrays.equals(s1Count, s2Count)) {
                return true;
            }
        }

        return false;
    }
}
