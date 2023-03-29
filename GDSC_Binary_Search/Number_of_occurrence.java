class Solution {
    int count(int[] arr, int n, int x) {
        int r = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                r++;
            }
        }
        return r;
    }
}