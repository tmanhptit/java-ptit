package J03_xaunhiphan;

import java.util.Scanner;

public class J03025 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			String s = sc.next();
			if(check(s)) System.out.println("YES");
			else System.out.println("NO");
		}
	}

	public static boolean check(String s) {
		boolean dem = true;
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				if (dem) dem = false;
				else return false;
			}
		}
        if(dem&&s.length()%2==0) return false;
        else return true;

	}
}