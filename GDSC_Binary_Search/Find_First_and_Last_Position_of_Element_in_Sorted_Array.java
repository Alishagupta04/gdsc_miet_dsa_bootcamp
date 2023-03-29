class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int r=-1,s=-1;
        for(int i=0;i<n;i++){
            if(nums[i] == target){
                r = i;
                break;
            }
        }

        for(int i=n-1;i>=0;i--){
            if(nums[i] == target){
                s = i;
                break;
            }
        }

        int arr[] = {r,s};
        return arr;  
    }
}