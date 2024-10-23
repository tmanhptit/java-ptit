import java.util.Scanner;

public class code21 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true) {
			long a=sc.nextLong();
			long b=sc.nextLong();
			if(a==0&&b==0) break;
			
			System.out.println(amub(a,b));
		}
      
	}

	public static long amub(long a, long b) {
		final long mol = (long) (1e9 + 7);
		if(a==0)return 0;
		if(a==1)return 1;
		if(b==0)return 1;
		if (b == 1) return a;
		
		
		if (b % 2 == 0) {
			long x=amub(a,b/2)%mol;
			return (x*x)%mol;
		}
		else {
			long x=amub(a,b/2)%mol;
			return (((x*x)%mol)*(a%mol))%mol;
		}
	}
}
package J01_basis;

public class J01021_tINHLUYTHUA {

}
