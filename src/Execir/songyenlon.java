package Execir;

import java.math.BigInteger;
import java.util.Scanner;

public class songyenlon {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		BigInteger a=sc.nextBigInteger();
		BigInteger b=new BigInteger("11");
		BigInteger c=new BigInteger("0");

		if((a.mod(b)).equals(c)) System.out.println(1);
		else System.out.println("0");
		
	}
}
}
