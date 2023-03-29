class Solution {
    public void sortColors(int[] nums) {
        int k=0;
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = nums[i];
        }
       for(int i=0;i<=2;i++){
           for(int j=0;j<nums.length;j++){
               if(arr[j]==i){
                       nums[k]=i;
                       k++;
               }
           }
       } 
    }
}