class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        int[] copyScore = Arrays.copyOf(score, n);
        Arrays.sort(score);
        if(n == 1){
            result[0]= "Gold Medal";
            return result;
        }
        if(n < 3){
            if(copyScore[0] > copyScore[1]){
                result[0] = "Gold Medal";
                result[1] = "Silver Medal";
            }else{
                result[0] = "Silver Medal";
                result[1] = "Gold Medal";
            }
            return result;
        }
        int first = score[n-1];
        int second = score[n-2];
        int third = score[n-3];

        for(int i = 0; i < n; i++){
            if(copyScore[i] == first){
                result[i] = "Gold Medal";
            }else if(copyScore[i] == second){
                result[i] = "Silver Medal";
            }else if(copyScore[i] == third){
                result[i] = "Bronze Medal";
            }else{
                for(int j = 0; j < n; j++){
                    if(copyScore[i] == score[j]){
                        result[i] = Integer.toString(n - j);
                    }
                }

            }
        }
        return result;

    }
}