package J03_xaunhiphan;

import java.util.Scanner;

public class J03005_CHUANHOAHOTEN2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		while (n-- > 0) {

			String s = sc.nextLine();
			Scanner ss = new Scanner(s);
			String result = "";
			int dem=0;
			String ho="";
			while (ss.hasNext()) {
				dem++;
				String word = ss.next();
				if(dem==1) {
					ho=word.substring(0, word.length()).toUpperCase();
				}else {
				
				result += word.substring(0, 1).toUpperCase() + word.substring(1, word.length()).toLowerCase() + " ";
				}
			}
			String xoa=result.substring(0,result.length()-1);
			System.out.println(xoa+", "+ho);
		}
	}
}
