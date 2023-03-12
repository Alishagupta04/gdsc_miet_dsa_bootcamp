import java.util.*;
public class Akku_and_Binary_Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L = sc.nextInt();
		int R = sc.nextInt();
		int total = 0;
        for(int i=L;i<=R;i++){
            int a=i;
            int count=0;
            while(a>0){
                if((a%2)==1){
                    count++;
                }
                a=a>>1;
            }
            if(count==3){
                total++;
            }
        }
        System.out.print(total);
        

	}

}
