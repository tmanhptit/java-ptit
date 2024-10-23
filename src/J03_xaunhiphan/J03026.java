package J03_xaunhiphan;

import java.util.Scanner;

//import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class J03026 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0) {
		String s1=sc.next();
		String s2=sc.next();
		if(chek(s1,s2))System.out.println(-1);
		else {
			System.out.println(Math.max(s1.length(), s2.length()));
		}
	}
}
public static boolean chek(String s1,String s2) {
	if(s1.length()!=s2.length())return false;
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)!=s2.charAt(i))return false;
	}
	return true;
}
}
