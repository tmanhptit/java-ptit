package Execir;

import java.util.Scanner;

public class J03040 {
	public static boolean c1(String a) {
		for(int i=0;i<4;i++) {
			if((int) a.charAt(i)>=(int)a.charAt(i+1)) return false;
		}
		
		return true;
	}
	public static boolean c2(String a) {
		for(int i=0;i<2;i++) {
			if(a.charAt(i)!=a.charAt(i+1)) return false;
		}
		if(a.charAt(3)!=a.charAt(4)) return false;
		
		return true;
	}
	public static boolean c3(String a) {
		for(int i=0;i<5;i++) {
			if(a.charAt(i)!='6'&&a.charAt(i)!='8') return false;
		}
		return true;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	sc.nextLine();
	while(t-->0) {
		String s=sc.nextLine();
		String a=s.substring(5,8)+s.substring(9, 11);
	    //System.out.println(a);
		if(c1(a)||c2(a)||c3(a)) System.out.println("YES");
		else System.out.println("NO");
	}
}
}
/*
7
29T1–123.45
29T1–555.55
29T1–222.33
29T1–686.88
29T1–123.33
29T1–555.54
29T1–606.88
*/
