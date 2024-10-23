package J03_xaunhiphan;

import java.util.Scanner;

public class J03006_SODEP1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		String s=sc.next();
		if(checkchan(s)&&checkthuannghich(s))System.out.println("YES");
		else System.out.println("NO");
	}
}
public static boolean checkchan(String s) {
	for(int i=0;i<s.length()-1;i++) {
		if((s.charAt(i)-'0')%2==1) {
			return false;
		}
	}
		return true;
}
public static boolean checkthuannghich(String s) {
	for(int i=0;i<s.length()/2;i++) {
		if(s.charAt(i)!=s.charAt(s.length()-i-1))return false;
	}
	return true;
}
}
