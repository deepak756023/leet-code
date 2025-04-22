// class Solution {
//     public double findMaxAverage(int[] nums, int k) {
        
//         double result = Double.NEGATIVE_INFINITY;;
//         for(int i = 0; i <= nums.length - k; i++){
//             double  sum = 0;
//             for (int j = i; j < i + k && j < nums.length; j++) {
//                 sum += nums[j];
//             }
//             if (sum > result) {
//                 result = sum;
//             }
//         }
//         double  avg = result / k;
//         return avg;
//     }
// }

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;

        // Calculate initial window sum
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double result = sum;

        // Slide the window across the array
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i]; // subtract the first, add the next
            result = Math.max(result, sum);
        }

        return result / k;
    }
}
