
package thuchanh;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bai4_hss {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<occ> ds = new ArrayList<occ>();
		int n = sc.nextInt();
		int dem = 0;
		while (n-- > 0) {
			dem++;
			sc.nextLine();
			occ e = new occ(dem, sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
			ds.add(e);
		}
		//Collections.sort(ds);
		for (occ occ : ds) {
			System.out.println(occ);
		}
	}
}

class occ implements Comparable<occ> {
	private String ma, ten, xeploai;
	private int tuoi, diemtb;

	public occ(int ma, String ten, String tuoi, double d1, double d2) {
		if(ma<10)this.ma="PH0"+ma;
		else this.ma ="PH"+ ma;
		this.ten = ten;	
		this.tuoi = 2021-Integer.parseInt(tuoi.substring(6, 10));
		
		double e=(d1+d2)/2+thuong(d1,d2);
		this.diemtb=(int)Math.round(e);
		if(this.diemtb<5) this.xeploai="Truot";
		else if(this.diemtb<7) this.xeploai="Trung binh";
		else if(this.diemtb<8) this.xeploai="Kha";
		else if(this.diemtb<9) this.xeploai="Gioi";
		else this.xeploai="Xuat sac";
		
	}
    
	@Override
	public String toString() {
		if(diemtb>10) diemtb=10;
		return "" + ma + " " + ten + " " + tuoi + " " + diemtb
				+ " "+xeploai;
	}

	@Override
	public int compareTo(occ o) {
		// TODO Auto-generated method stub
		return Double.compare(o.diemtb, this.diemtb);
	}
	public static double thuong(double a,double b) {
		if(a>=8&&b>=8) return 1;
		if(a>=7.5&&b>=7.5) return 0.5;
		
		return 0;
	}

}
/*
3
Doan Thi Kim
13/03/1982
8
9,5
Dinh Thi Ngoc Ha
03/09/1996
6,5
8
Tran Thanh Mai
12/09/2004
8
9
 */