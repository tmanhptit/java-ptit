package thuchanh;

import java.math.BigInteger;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {

			BigInteger a = sc.nextBigInteger();
			BigInteger b=sc.nextBigInteger();
			BigInteger c = a.subtract(b);
			int maxx=Math.max(a.toString().length(), b.toString().length());
			maxx-=c.abs().toString().length();
			if(maxx!=0)System.out.print("0");
			System.out.println(c.abs().toString());
		}
	}
}
