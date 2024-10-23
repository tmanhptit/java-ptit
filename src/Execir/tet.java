package Execir;

import java.io.IOException;
import java.util.Scanner;

public class tet {
	public static boolean check(int a) {
		String s=""+a;
		int n=s.length();
		if(n<3||n%2==0) return false;
		for(int i=0;i<n;i++) {
			if((s.charAt(i)-'0')%2==0) return false;
		}
		
		for(int i=0;i<=n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-i-1)) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int a=131;
		if(check(a)) System.out.println("La so thuan nghich");
		else System.out.println("Khong");
	}
}
