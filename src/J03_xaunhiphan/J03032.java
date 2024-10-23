package J03_xaunhiphan;

import java.util.Scanner;
import java.util.Stack;

public class J03032 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
        String s=sc.nextLine();
        Scanner ss=new Scanner(s);
        while(ss.hasNext()) {
        	String tam=ss.next();
        	//<Character> stack=new Stack();
        	for(int i=tam.length()-1;i>=0;i--) {
        		System.out.print(tam.charAt(i));
        	}
        	System.out.print(" ");
        }
        System.out.println();
		}
	}
}
