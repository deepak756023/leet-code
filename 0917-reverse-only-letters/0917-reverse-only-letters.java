class Solution {
    public String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        int len = ch.length;

        int left = 0;
        int right = len - 1;

        while(left < right){
            if(!Character.isLetter(ch[left])){
                left++;
                continue;
            }
            if(!Character.isLetter(ch[right])){
                right--;
                 continue;
            }
            var temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;

        }

        return new String(ch);
        
    }
}