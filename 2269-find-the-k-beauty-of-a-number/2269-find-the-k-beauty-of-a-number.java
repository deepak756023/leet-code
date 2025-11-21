class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = Integer.toString(num);
        int count = 0;
        for(int i = 0; i <= s.length() - k; i++){
            int div =Integer.parseInt(s.substring(i, i + k));
            if(div != 0 && num % div == 0){
                count++;
            }

        }
        return count;
    }
}