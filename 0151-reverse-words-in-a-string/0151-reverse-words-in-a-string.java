class Solution {
    public String reverseWords(String s) {
        int len = s.length();
        StringBuilder str = new StringBuilder();
        int start = 0;
        int end = start;

        while(end < len){
            if(s.charAt(start) == ' '){
                start++;
                end++;
                continue;
            }else{
                if(s.charAt(end) == ' ' || end == len - 1){
                    if(end == len - 1){
                        str.insert(0, s.substring(start, end + 1) + " ");
                        break;
                    }
                    str.insert(0, s.substring(start, end) + " ");
                    start = end;
                    continue;
                }
                end++;
                
            }
        }

        return str.toString().trim();



        
        
    }
}