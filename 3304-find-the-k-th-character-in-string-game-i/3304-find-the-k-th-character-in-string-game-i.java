class Solution {
    public char kthCharacter(int k) {
        StringBuffer word = new StringBuffer("a");

        while(word.length() < k){
            for(var ch : word.toString().toCharArray()){
                var next = (char) (ch + 1);
                word.append(next);
            }

        }

        return word.charAt(k - 1);
    }
}