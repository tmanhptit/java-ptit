package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05014 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<gv> ds = new ArrayList<gv>();
		int n = sc.nextInt();
		int dem = 0;
		while (n-- > 0) {
			 sc.nextLine();
			dem++;
			String ten = sc.nextLine();
			String ma = sc.nextLine();
			double d1 = sc.nextDouble();
			double d2 = sc.nextDouble();
			ds.add(new gv(dem, ten, ma, d1*2.0+d2));
		}
		Collections.sort(ds);
		for (gv gv : ds) {
			System.out.println(gv);
		}
	}

}

class gv implements Comparable<gv> {
	private String ma, ten, uu, mon;
	private double d;

	public gv(int ma, String ten, String uu, double d) {

		this.ma = String.format("GV%02d", ma);
		this.ten = ten;

		if (uu.charAt(0) == 'A')
			this.mon = "TOAN";
		else if (uu.charAt(0) == 'B')
			this.mon = "LY";
		else
			this.mon = "HOA";

		if (uu.charAt(1) == '1')
			this.d = d + 2.0;
		else if (uu.charAt(1) == '2')
			this.d = d + 1.5;
		else if (uu.charAt(1) == '3')
			this.d = d + 1.0;
		else
			this.d = d;
		if (this.d < 18)
			this.uu = "LOAI";
		else
			this.uu = "TRUNG TUYEN";
	}

	@Override
	public String toString() {
		String to = String.format("%s %s %s %.1f %s", ma, ten, mon, d, uu);

		return to;
	}

	@Override
	public int compareTo(gv o) {
		// TODO Auto-generated method stub
		return Double.compare(o.d, this.d);
	}

}
/* 
3
Le Van Binh
A1
7,0
3,0
Tran Van Toan
B3
4,0
7,0
Hoang Thi Tam
C2
7,0
6,0
*/
