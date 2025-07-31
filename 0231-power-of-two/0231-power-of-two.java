// class Solution {
//     public boolean isPowerOfTwo(int n) {
//         if(n <= 0){
//            return false;
//         }
//         while(n % 2 == 0){
//             n /= 2;
//         }
//         return n == 1;
//     }
// }

public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        if (n == 1) return true;
        return (n % 2 == 0) && isPowerOfTwo(n / 2);
    }
}