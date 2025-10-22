class Solution {
    public String firstPalindrome(String[] words) {

        for(int i = 0; i < words.length; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
        
    }

    private boolean isPalindrome(String word){
        char[] chars = word.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            if(chars[left] != chars[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}