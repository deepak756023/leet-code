class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 1, sum = 0;
        for(int i = 0; i < s.length(); i++){
            sum += widths[s.charAt(i) - 'a'];
            if(sum > 100){
                sum = widths[s.charAt(i) - 'a'];
                count++;
            }

        }
        return new int[]{count, sum};
    }
}