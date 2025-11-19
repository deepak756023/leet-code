class Solution {
    public int[] decrypt(int[] code, int k) {
        int len = code.length;
        int[] res = new int[len];
        if(k == 0){
            for(int i = 0; i < len; i++){
                res[i] = 0;
            }
            return res;
        }else if(k > 0){
            int sum = 0;
            int j = 0;
            while(k > 0){
                j = (j+1) % len;
                sum = sum + code[j];
                k--;
            }

            for(int i = 0; i < len; i++){
                res[i] = sum;
                sum = sum - code[(i+1) % len] + code[(j+1) % len];
                j++;
            }
            return res;

        }else{
            int sum = 0;
            int j = len;
            while(k < 0){
                j = (j - 1) % len;
                sum = sum + code[j];
                k++;
            }

            for(int i = 0; i < len; i++){
                res[i] = sum;
                sum = sum + code[(i) % len] - code[(j) % len];
                j++;
            }
            return res;
        }
    }
}