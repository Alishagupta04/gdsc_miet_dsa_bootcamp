package arraysGDSC;

import java.util.*;

public class Second_Largest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
        int lar = arr[size-1];
        for(int i=size-2;i>=0;i--){
            if(lar>arr[i]){
               System.out.println(arr[i]);
               break;
            }
        }
	}

}
