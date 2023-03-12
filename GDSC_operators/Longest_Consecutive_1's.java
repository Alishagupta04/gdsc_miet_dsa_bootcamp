import java.util.*;

public class LongestConsecutive {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count=0,maxi=0;
		while(a>0) {
			if((a%2)==1) {
				count++;
			}
			else {
				maxi = Math.max(count, maxi);
				count = 0;
			}
			a=a>>1;
		}
		System.out.print(Math.max(count, maxi));
		
	}

}
