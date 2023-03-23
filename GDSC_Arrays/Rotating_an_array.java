class Solution {
    void leftRotate(int[] arr, int n, int d) {
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        
        for(int i=0;i<n-d;i++){
            arr[i]=temp[i+d];
        }
        
        for(int i=0;i<n;i++){
            if(d>0){
                arr[n-d]=temp[i];
                d--;
                continue;
            }
            else{
                break;
            }
            
        }
    }
}