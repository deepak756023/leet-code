class Solution {
    public String removeKdigits(String num, int k) {
        if (num.length() == k)
            return "0";

        int min = Integer.MAX_VALUE;
        for(int i = 0; i <= num.length()-k; i++){
            String n = num.substring(0, i) + num.substring(i + k);
            int val = Integer.parseInt(n);
            if(val < min){
                min = val;
            }
        }

        return Integer.toString(min);

    }
}