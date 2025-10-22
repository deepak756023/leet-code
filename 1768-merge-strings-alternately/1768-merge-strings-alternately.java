class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int first = 0;
        int second = 0;

        while(first < word1.length() && second < word2.length()){
            result.append(word1.charAt(first));
            result.append(word2.charAt(second));
            first++;
            second++;

        }
        if(first == word1.length()){
            result.append(word2.substring(second));
        }

        if(second == word2.length()){
            result.append(word1.substring(first));
        }

        return result.toString();
        
    }
}