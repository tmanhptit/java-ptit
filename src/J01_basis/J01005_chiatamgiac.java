package J01_basis;

import java.util.Scanner;

public class J01005_chiatamgiac  { 
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		
		int t=ss.nextInt();
		while(t-->0) {
			int n=ss.nextInt();
			int h=ss.nextInt();
	
			for(int i=2;i<=n;i++) {
				double x= Math.sqrt((double)(i-1)/n)*(double)h;
				 System.out.printf("%.6f ", x);
				 //System.out.print(" ");
			}
			System.out.println();
			
		}
	}
}
