import java.util.*;

public class Find_the_Duplicate_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<size-1;i++) {
			if(arr[i]==arr[i+1]) {
				System.out.print(arr[i]);
				break;
			}
		}
	}

}
