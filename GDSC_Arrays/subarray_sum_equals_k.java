package arraysGDSC;

import java.util.*;

public class subarray_sum_equals_k {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int nums[] = new int[size]; //an array of integers 
		for(int i=0;i<size;i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt(); // an integer k
		int sum=0;
        for(int i=0;i<nums.length-1;i++){
                int result=i+1,res=0;
                while(result<nums.length){
                    res = res + nums[result];
                    if(nums[i]+res==k){
                        sum++;
                    }
                    
                    result++;
                }
                
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]==k){
                sum++;
                }
            }
         	System.out.print(sum); //total number of subarrays whose sum equals to k
        
            

	}

}
