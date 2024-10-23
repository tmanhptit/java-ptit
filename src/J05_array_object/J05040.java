package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05040 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dem = 0;
		sc.nextLine();
		ArrayList<ngulon> hehe = new ArrayList<>();
		while (n-- > 0) {

			dem++;
			// System.out.prdoubleln("Ten");
			String ten = sc.nextLine();
			// System.out.prdoubleln("luong");
			double luong = sc.nextDouble();
			// System.out.prdoubleln("songay");
			double songay = sc.nextDouble();
			sc.nextLine();
			// System.out.prdoubleln("Chucvu");
			String chucvc = sc.nextLine().trim();
			ngulon e = new ngulon(dem, ten, chucvc, luong, songay);

			hehe.add(e);
		}
		Collections.sort(hehe);
		//double tong = 0;
		for (ngulon ngulon : hehe) {
			////tong += ngulon.getTong();
			System.out.println(ngulon);
		}
		//System.out.printf("Tong chi phi tien luong: %.0f",tong);
	}
}
class ngulon implements Comparable<ngulon>{
	private String ma,ten;
	private double luong,phucap,tong;
	private double thuong;
	public ngulon(int ma, String ten,String chucvu,double luongngay,double songay) {
		if (ma < 10) this.ma ="NV0" + ma;
		else this.ma =  "NV" + ma;
		this.ten = ten;
		this.luong=songay*luongngay;
		
		if (songay > 24) {
			
			this.thuong = this.luong/5;
		}
			
		else if (songay > 21)
			this.thuong = this.luong/10;
		else
			this.thuong = 0;
		
		if (chucvu.equals("GD"))
			this.phucap = 250000;
		else if (chucvu.equals("PGD"))
			this.phucap = 200000;
		else if (chucvu.equals("TP"))
			this.phucap = 180000;
		else if(chucvu.equals("NV")) this.phucap = 150000;
			

		this.tong=this.luong+this.thuong+this.phucap;
	}
	public double getTong() {
		return tong;
	}
	public void setTong(double tong) {
		this.tong = tong;
	}
	@Override
	public String toString() {
		String luongn=String.format("%.0f %.0f %.0f %.0f", luong,thuong,phucap,tong);
		return  ma + " " + ten + " "+luongn;
	}
	@Override
	public int compareTo(ngulon o) {
		// TODO Auto-generated method stub
		return Double.compare(o.tong, this.tong);
	}
	
	
}

/*
3
Cao Van Vu
50000
26
GD
Do Van Truong
40000
25
PGD
Truong Thi Tu Linh
45000
22
NV

 */
 
