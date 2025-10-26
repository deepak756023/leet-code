class Solution {
    public int minimumLength(String s) {

        int start = 0;
        int end = s.length() - 1;

        while(start < end){
            if(s.charAt(start) == s.charAt(end)){
                if(start == end - 1) return 0;
                if(s.charAt(start) == s.charAt(start + 1)){
                    start++;
                    continue;
                }
                if(s.charAt(end) == s.charAt(end - 1)){
                    end--;
                    continue;
                }
                start++;
                end--;
                if(start == end) return 1;
                
            }else{
                return end - start + 1;
            }
        }

        

        return 1;
        
    }
}