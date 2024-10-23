package J01_basis;

import java.util.Scanner;

public class J01004_SONGuyento {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			long n = sc.nextLong();
			boolean check=false;
			for(int i=2;i*i<=n;i++) {
				if(n%i==0) {
					check=true;
					break;
				}
			}
			if(check) System.out.println("NO");
			else System.out.println("YES");
		}
	}

}