import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger sum = BigInteger.ONE; // Start with 1
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = sum.add(BigInteger.valueOf(digits[i])
                    .multiply(BigInteger.TEN.pow(digits.length - i - 1)));
        }

        String total = sum.toString();
        int length = total.length();
        int[] result = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            result[i] = sum.mod(BigInteger.TEN).intValue();
            sum = sum.divide(BigInteger.TEN);
        }

        return result;
    }
}

// class Solution {
//     public int[] plusOne(int[] digits) {
//         long sum = 1;
//         for(int i = digits.length - 1; i >= 0; i--){
//             sum = sum + digits[i] * (long)Math.pow(10, (digits.length - i - 1));
//         }

//         String total = Long.toString(sum);
//         int length = total.length();

//         int[] result = new int[length];
//         for(int i = length - 1; i >= 0; i--){
//             result[i] = (int)(sum % 10);
//             sum = sum / 10;
//         }
//         return result;
//     }
// }


