package J01_basis;

import java.util.Scanner;

public class J01022_XAUNHIPHAN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long[] arr = new long[93];
		arr[1] = arr[2] = 1;
		for (int i = 3; i < 93; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		while (t-- > 0) {
			int n = sc.nextInt();
			long k = sc.nextLong();
			while (n > 2) {
				if (k > arr[n - 2]) {
					k -= arr[n - 2];
					n--;
				} else n -= 2;
			}
			if (n == 1) {
				System.out.println(0);
			}
			if (n == 2) {
				System.out.println(1);
			}

		}
	}
}