package J03_xaunhiphan;

import java.util.Scanner;

public class J03007_SODEP2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		String s=sc.next();
		
		if(checkchan(s))System.out.println("YES");
		else System.out.println("NO");
	}
}
public static boolean checkchan(String s) {
	if(s.charAt(0)!='8'||s.charAt(s.length()-1)!='8')
		return false;
	long sum=0;
	for(int i=0;i<s.length();i++) {
		sum+=(long)(s.charAt(i)-'0');
	}
	if(sum%10!=0) return false;
	else return true;
	
	
}

}
