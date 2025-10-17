class Solution {
    public int removeDuplicates(int[] arr) {
        int start = 0;
        int next = 1;

        while(next < arr.length){
            if(arr[start] != arr[next]){
                start++;
                arr[start] = arr[next];
            }
            next++;
        }

        return start + 1;
        
    }
}

