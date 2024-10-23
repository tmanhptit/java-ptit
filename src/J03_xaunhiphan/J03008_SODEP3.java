package J03_xaunhiphan;

import java.util.Scanner;

public class J03008_SODEP3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		String s=sc.next();
		if(checkthuannghich(s))System.out.println("YES");
		else System.out.println("NO");
	}
}
public static boolean nt(char s) {
	
	if((s-'0')!=2&&(s-'0')!=3&&(s-'0')!=5&&(s-'0')!=7) return false;
	return true;
}
public static boolean checkthuannghich(String s) {
	
	for(int i=0;i<s.length()/2;i++) {
		if((s.charAt(i)!=s.charAt(s.length()-i-1))|| !nt(s.charAt(i)) ||!nt(s.charAt(s.length()-i-1)))return false;
	}
	return true;
}
}
