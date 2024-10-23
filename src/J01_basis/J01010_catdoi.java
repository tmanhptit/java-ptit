package J01_basis;

import java.util.Scanner;

public class J01010_catdoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s=sc.next();
			String kq="";
			boolean check=false;
			for(int i=0;i<s.length();i++) {
				if(s.charAt(i)=='0'||s.charAt(i)=='8'||s.charAt(i)=='9') {
					kq+='0';
				}else if(s.charAt(i)=='1') kq+='1';
				else {
					check=true;
					break;
				}
			}
			//System.out.println(kq);
			
			if(check) System.out.println("INVALID");
			else { 
				int i=0;
				while(i<kq.length()&&kq.charAt(i)=='0') {
					i++;
				}
				//System.out.printf("kq (%d) ",i);
				if(i>=kq.length()) {
					System.out.println("INVALID");
					
				}else {
				for(int x=i;x<kq.length();x++) {
					System.out.print(kq.charAt(x));
				}
				System.out.println();
				}
				
			}
			
			
			
		}
	}
    
}
