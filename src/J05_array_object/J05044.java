package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05044 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dem = 0;
		ArrayList<hehe> danhsach = new ArrayList<>();
		while (n-- > 0) {
			sc.nextLine();
			dem++;
			danhsach.add(new hehe(dem,sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble()));
		}
		Collections.sort(danhsach);
		for (hehe hehe : danhsach) {
			//if(hehe.getChucvu().equals(hh))System.out.println(hehe);
			System.out.println(hehe);
		}
	}
}

class hehe implements Comparable<hehe>{
	private String ma, ten,chucvu;
	private double phucap, luong, tamung, conlai;

	public hehe(int ma, String ten, String chucvu, double luongngay, double songay) {
		if (ma < 10) {
			this.ma = "NV0" + ma;
		} else
			this.ma = "NV" + ma;
		this.ten = ten;
        this.chucvu=chucvu;
        
		if (chucvu.equals("GD"))
			this.phucap = 500;
		else if (chucvu.equals("PGD"))
			this.phucap = 400;
		else if (chucvu.equals("TP"))
			this.phucap = 300;
		else if (chucvu.equals("KT"))
			this.phucap = 250;
		else
			this.phucap = 100;

		this.luong = luongngay * songay;

		if ((this.luong + this.phucap)  < 37500) {
			this.tamung = Math.round((this.luong + this.phucap) * 2 / 3000) * 1000;
		} else
			this.tamung = 25000;
		this.conlai = this.luong - this.tamung + this.phucap;
	}

	public String getChucvu() {
		return chucvu;
	}

	public void setChucvu(String chucvu) {
		this.chucvu = chucvu;
	}

	@Override
	public String toString() {

		String luongn = String.format("%.0f %.0f %.0f %.0f", phucap, luong, tamung, conlai);
		return ma + " " + ten + " " + luongn;
	}
	@Override
	public int compareTo(hehe o) {
		// TODO Auto-generated method stub
		if(o.luong+o.phucap!=this.luong+this.phucap) return Double.compare(o.luong+o.phucap,this.phucap+ this.luong);
		else return this.ma.compareTo(o.ma);
	}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1001
24
Doan Truong An
TP
3000
25
Le Thanh
GD
5000
28
 */

	
}
