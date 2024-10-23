//tính số fibonalci n<92
//co so 0
package J01_basis;


import java.util.Scanner;

public class J01007_CHekFIbo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] fib = new long[93];
		fib[1] = fib[2] = 1;
		for (int i = 3; i < 92; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		int t = sc.nextInt();
		while (t-- > 0) {
			 long a = sc.nextLong();
         boolean kt = false;
         for(int i=0;i<92;i++){
             if(fib[i]>a) break;
             if(fib[i] == a){
                 kt = true;
                 break;
             }
         }
         if(kt == true)
             System.out.println("YES");           
         else
             System.out.println("NO");
			
		}
	}
}
