import java.util.Scanner;

public class code17 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		long n=sc.nextLong();
		for(int i=2;i<=Math.sqrt(n);i++) {
			while(n%i==0) {
				n/=i;
			}
		}
		System.out.println(n);
	}
}
}
