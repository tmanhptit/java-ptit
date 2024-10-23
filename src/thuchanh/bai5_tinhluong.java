

package thuchanh;


import java.util.ArrayList;

import java.util.Scanner;


public class bai5_tinhluong {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<tinhluong> ds = new ArrayList<tinhluong>();
		int n = sc.nextInt();
		int dem = 0;
		int demht=0;
			int demhp=0;
		while (n-- > 0) {
			dem++;
			sc.nextLine();
			
			String ma=sc.nextLine();
			String ten=sc.nextLine();
			double co=sc.nextDouble();
			String hee=ma.substring(0, 2);
			if(hee.equals("HT")) {
				demht++;
				if(demht<2) ds.add(new tinhluong(ma, ten, co));
			}else if(hee.equals("HP")) {
				demhp++;
				if(demhp<3) ds.add(new tinhluong(ma, ten, co));
			}else ds.add(new tinhluong(ma, ten, co));
			
		}
		//Collections.sort(ds);
		for (tinhluong tinhluong : ds) {
			System.out.println(tinhluong);
		}
	}
}

class tinhluong {
	private String ma, ten;
	private double thunhap,phucap;
	private int bacluong;
    
	
	public tinhluong(String ma, String ten, double coban) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.bacluong = Integer.parseInt(ma.substring(2, 4));
		if(ma.substring(0,2).equals("HT")) this.phucap=2000000;
		else if(ma.substring(0,2).equals("HP")) this.phucap=900000;
		else if(ma.substring(0,2).equals("GV")) this.phucap=500000;
		
		this.thunhap = coban*this.bacluong+this.phucap;
		
		
	}


	@Override
	public String toString() {
		String hee=String.format("%.0f %.0f",phucap,thunhap);
		return "" + ma + " " + ten +" "+bacluong+ " " +hee;
	}



	
}
/*
3
GV01
Nguyen Kim Loan
1420000
HT05
Hoang Thanh Tuan
1780000
GV02
Tran Binh Nguyen
1468000
 */
