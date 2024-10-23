import java.util.Scanner;

public class J010011_uclnBCNN{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long a = sc.nextLong();
			long b = sc.nextLong();
            System.out.println(a/ucln(a, b)*b+" "+ucln(a, b));
		}
	}

	public static long ucln(long a, long b) {
		while (true) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
			if(a==b)return a;
		}

	}
}
