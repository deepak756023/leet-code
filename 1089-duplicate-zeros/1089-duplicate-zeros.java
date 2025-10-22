class Solution {
    public void duplicateZeros(int[] arr) {
         int[]temp=new int[arr.length];
        
        for(int i=0,j=0;j<temp.length;i++){
            temp[j]=arr[i];
            if(temp[j++]==0&&j<temp.length){
                temp[j++]=0;
            }
        }
        System.arraycopy(temp,0,arr,0,arr.length);
    }
}