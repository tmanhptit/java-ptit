package J03_xaunhiphan;

import java.util.Scanner;

public class J03004_XULYHOTEN1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	while(n-->0) {
		
		String s=sc.nextLine();
		Scanner ss=new Scanner(s);
		String result="";
		while(ss.hasNext()) {	
			String word=ss.next();
			result+=word.substring(0, 1).toUpperCase()+ word.substring(1,word.length()).toLowerCase()+" ";
		}
		System.out.println(result);
	}
}
}
