// class Solution {
//     public boolean validPalindrome(String s) {
//         int len = s.length();
//         if(len == 0 || len == 1 || len == 2) return true;

//         int left = 0;
//         int right = len -1;
//         int count = 1;

//         while(left < right){
//             if(s.charAt(left) != s.charAt(right)){
//                 if(count != 1){
//                     return false;
//                 }


//                 //Important test case fail : abcbdbca


//                 if(s.charAt(left + 1) == s.charAt(right)){
//                     left = left + 2;
//                     right--;
//                     count--;
//                     continue;
//                 }else if(s.charAt(left) == s.charAt(right - 1)){
//                     right = right -2;
//                     left++;
//                     count--;
//                     continue;
//                 }else{
//                     return false;
//                 }
//             }
//             right--;
//             left++;
//         }
//         return true;
        
//     }
// }

class Solution {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
