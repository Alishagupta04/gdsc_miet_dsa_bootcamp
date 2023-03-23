package arraysGDSC;

import java.util.*;

public class Move_Zeroes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<size;i++) {
			nums[i] = sc.nextInt();
		}
		 //move all 0's to the end
	        for(int i=0;i<nums.length;i++){ 
	            if(nums[i]==0){
	                int j=i;
	                while(j<nums.length-1 && nums[j]==0){
	                    j++;
	                }
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	            }
	        }
	        for(int i=0;i<size;i++) {
	        	System.out.print(nums[i]+" ");
	        }
	}

}
