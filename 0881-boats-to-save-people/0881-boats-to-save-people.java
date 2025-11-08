class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int start = 0;
        int count = 0;
        int sum = 0;

        while (start < people.length) {
            sum = sum + people[start];
            while (sum < limit) {
                if(start == people.length - 1){
                    count++;
                    return count;
                }
                start++;
                sum = sum + people[start];

            }
            count++;
            if (sum == limit)
                start++;
            sum = 0;

        }

        return count;

    }
}