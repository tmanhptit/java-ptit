package J01_basis;
import java.util.Scanner;

public class J01006_fibonacci{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long[] fib=new long[93];
	fib[1]=fib[2]=1;
	for(int i=3;i<=92;i++) {
		fib[i]=fib[i-1]+fib[i-2];
	}
	int t=sc.nextInt();
	while(t-->0) {
		int a=sc.nextInt();
		System.out.println(fib[a]);
	}
}
}
