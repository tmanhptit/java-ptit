package J03_xaunhiphan;

import java.util.Scanner;

public class J03024 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();
			/*for(int i=0;i<s.length();i++) {
				System.out.println(s.charAt(i)+":"+(int)s.charAt(i));
			}*/
			if (!check1(s))
				System.out.println("INVALID");
			else {
                if(check2(s))System.out.println("YES");
                else System.out.println("NO");
			}

		}
	}

	public static boolean check1(String s) {
		//if (s.charAt(0) == '0') return false;
		
		for (int i = 0; i < s.length(); i++) {
			if ((int) s.charAt(i) > 57 || (int) s.charAt(i) < 48)
				return false;
		}
		return true;
	}

	public static boolean check2(String s) {
		int n = s.length();
		int dem = 0;
		for (int i = 0; i < n; i++) {
			if ((int) s.charAt(i) % 2 == 0) {
				dem++;
			} else
				dem--;
		}
		if (n % 2 == 0) {
			if (dem > 0)
				return true;
			else
				return false;
		} else {
			if (dem < 0)
				return true;
			else
				return false;
		}
	}
}