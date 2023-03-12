import java.util.*;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int numbers[] = new int[size];
		System.out.println("Enter numbers");
		for(int i=0;i<size-1;i++) {
			numbers[i] = sc.nextInt();
		}
		int sum = 0,missingNo;
		for(int i=0;i<=size;i++) {
			sum = sum+i;
		}
		int arrSum = 0;
		for(int i=0;i<size;i++) {
			arrSum = arrSum+numbers[i];
		}
		missingNo = sum-arrSum;	
		System.out.print("Missing number :- "+missingNo);
	}

}
