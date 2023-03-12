
import java.util.*;

public class Single_Number {
	public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[nums.length-1];
        }
        for(int i=0;i<(nums.length-1);i=i+2){
                if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }

        return nums[nums.length-1];   

    } 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<size;i++) {
			nums[i] = sc.nextInt();
		}
		int result = singleNumber(nums);
		System.out.print(result);
	}

}
