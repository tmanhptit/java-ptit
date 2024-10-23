package Execir;

import java.util.Scanner;

public class J01014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			Long n=sc.nextLong();
			for (int i = 2; i * i <= n; i++) {
				while (n % i == 0 && n > 2)
					n /= i;
			}
			System.out.println(n);
		}
	}
}
