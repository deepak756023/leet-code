import java.util.List;
import java.util.stream.Collectors;
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {


       int[] arr=new int[nums.length+1];
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]=nums[i];

        }
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                ans.add(i);
            }
        }
        return ans;
        
        //Time Limit Exceeded

        // List<Integer> list = IntStream.rangeClosed(1, nums.length)
        //                               .boxed()
        //                               .filter(x -> Arrays.stream(nums).noneMatch(y -> y == x))
        //                               .collect(Collectors.toList());
        // return list;
       
        
        
    }
}