package arraysGDSC;

import java.util.*;

public class Rotate_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<size;i++) {
			nums[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		int[] temp = new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			temp[i] = nums[i];
		}
		for(int i=0;i<nums.length;i++) {
			nums[(i+k)%(nums.length)] = temp[i];
		}
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]);
		}
	}

}
