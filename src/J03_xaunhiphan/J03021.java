package J03_xaunhiphan;

import java.util.Scanner;

public class J03021 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int t=sc.nextInt();
	while(t-->0) {
		String s=sc.next();
		//System.out.println(s);
		s=s.toUpperCase();
		if(check(ans(s))) {
			System.out.println("YES");
		}else System.out.println("NO");
	}
}
public static boolean check(String s) {
	int n=s.length();
	for(int i=0;i<(n)/2;i++) {
		if(s.charAt(i)!=s.charAt(n-i-1)) return false;
	}
	return true;
}
public static String ans(String s) {
	String result="";
	for(int i=0;i<s.length();i++) {
		int hehe;
		if((int)s.charAt(i)>82&&(int)s.charAt(i)<90) {
			hehe=((int)s.charAt(i)-66)/3+2;
		}else if((int)s.charAt(i)==90) {
			hehe=9;
		}else {
		    hehe=((int)s.charAt(i)-65)/3+2;
		}
		
		result+=hehe;
	}
	return result;
}
}
