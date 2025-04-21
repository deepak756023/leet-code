class Solution {
    public int distributeCandies(int[] candyType) {
        int count = (int)Arrays.stream(candyType)
                         .distinct()
                         .count();
        if(count < candyType.length / 2){
            return count;
        }else{
            return candyType.length / 2;
        }
    }
}