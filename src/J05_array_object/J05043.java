package J05_array_object;

import java.util.ArrayList;
import java.util.Scanner;

public class J05043 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dem = 0;
		//sc.nextLine();
		ArrayList<ghett> dsnv = new ArrayList<>();
		while (n-- > 0) {
            
		}
		// Collections.sort(dsnv);
		for (ghett ghett : dsnv) {
			System.out.println(ghett);
		}
		
	}
}
class ghett{
	private String ma,ten;
	private double luong,phucap,conlai;
	private double tamung;
	public ghett(int ma, String ten,String chucvu,double luongngay,double songay) {
		if (ma < 10) this.ma ="NV0" + ma;
		else this.ma =  "NV" + ma;
		this.ten = ten;

		
		if (chucvu.equals("GD"))
			this.phucap = 500;
		else if (chucvu.equals("PGD"))
			this.phucap = 400;
		else if (chucvu.equals("TP"))
			this.phucap = 300;
		else if(chucvu.equals("KT"))
			this.phucap = 150000;
		else this.phucap=100;
		
		
		this.luong=luongngay*songay;
		
		if((this.luong+this.phucap)*2/3<25000) {
			this.tamung=Math.round((this.luong+this.phucap)*2/3000)*1000;
		}
		else this.tamung=25000;

		this.conlai=this.luong-this.tamung+this.phucap;
	}
	public double getconlai() {
		return conlai;
	}
	public void setconlai(double conlai) {
		this.conlai = conlai;
	}
	@Override
	public String toString() {
		
		String luongn=String.format("%.0f %.0f %.0f %.0f", phucap,luong,tamung,conlai);
		return  ma + " " + ten + " "+luongn;
	}
	
}
/*
4
Tran Thi Yen
NV
1000
24
Nguyen Van Thanh
BV
1000
30
Doan Truong A
TP
3000
25
Le Thanh
GD
5000
28
*/



