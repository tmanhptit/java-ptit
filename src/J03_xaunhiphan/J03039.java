package J03_xaunhiphan;

import java.math.BigInteger;
import java.util.Scanner;

public class J03039 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	BigInteger hih=new BigInteger("0");
	while(t-->0) {
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		if(a.compareTo(b)<0) {
			BigInteger c=b.mod(a);
			//System.out.println(c);
			
			if(c.equals(hih)) System.out.println("YES");
			else System.out.println("NO");
		}else if(a.compareTo(b)==0) System.out.println("YES");
		else {
			BigInteger c=a.mod(b);
			//System.out.println(c);
			if(c.equals(hih)) System.out.println("YES");
			else System.out.println("NO");
		}
	}
}
}
