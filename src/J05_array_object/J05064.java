package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05064 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<dao> ds=new ArrayList<>();
		int n=sc.nextInt();
		int demht=0;
		int demhp=0;
		while(n-->0) {
			sc.nextLine();
			String ma=sc.nextLine();
			String ten=sc.nextLine();
			double he=sc.nextDouble();
			String hee=ma.substring(0, 2);
			if(hee.equals("HT")) {
				demht++;
				if(demht<2) ds.add(new dao(ma, ten, he));
			}else if(hee.equals("HP")) {
				demhp++;
				if(demhp<3) ds.add(new dao(ma, ten, he));
			}else ds.add(new dao(ma, ten, he));
		}
		for (dao dao : ds) {
			System.out.println(dao);
		}
	}
}
class dao{
	private String ma,ten;
	private int bacluong;
	private double phucap,thunhap;
	public dao(String ma, String ten,double base) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.bacluong = Integer.parseInt(ma.substring(2, 4));
		if(ma.substring(0,2).equals("HT")) this.phucap=2000000;
		else if(ma.substring(0,2).equals("HP")) this.phucap=900000;
		else if(ma.substring(0,2).equals("GV")) this.phucap=500000;
		
		this.thunhap = base*this.bacluong+this.phucap;
		
	}
	@Override
	public String toString() {
		String hehe=String.format("%.0f %.0f", phucap,thunhap);
		return "" + ma + " " + ten + " " + bacluong + " "+hehe;
	}
	
}
/*
4
GV01
Nguyen Kim Loan
1420000
HT05
Tran Trong Manh
2000000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
*/
