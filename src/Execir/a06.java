package Execir;

import java.util.Scanner;

public class a06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] a = new long[93];
		a[1] = a[2] = 1;
		for (int i = 3; i < 93; i++) {
			a[i] = a[i - 2] + a[i - 1];
		}

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			while (true) {
				if (n < 3)
					break;
				if (k > a[n - 2]) {
					k -= a[n - 2];
					n--;
				} else {
					n -= 2;
				}
			}
			if (n == 1)
				System.out.println("0");
			else
				System.out.println("1");
		}
	}
}
