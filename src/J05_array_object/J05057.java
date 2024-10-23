package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05057 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<hi> ds = new ArrayList<>();

		while (n-- > 0) {
			sc.nextLine();
			String ten = sc.nextLine();
			String ma = sc.nextLine();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c=sc.nextDouble();
			ds.add(new hi(ten,ma,a*2+b+c));
		}
		 Collections.sort(ds);
		for (hi dooo : ds) {
			System.out.println(dooo);
		}
	}
}
class hi implements Comparable<hi>{
	private String ma,ten;
	private double d,uu;
	private String dau;
	public hi(String ma, String ten, double d) {
		super();
		this.ma = ma;
		this.ten = ten;
		if(ma.charAt(2)=='1') this.uu=0.5;
		else if(ma.charAt(2)=='2') this.uu=1;
		else this.uu=2.5;
		
		this.d = d+this.uu;
		if(this.d<24) this.dau="TRUOT";
		else this.dau="TRUNG TUYEN";
		
	}
	@Override
	public String toString() {
		String dd,u;
		if(isDoubleInteger(d)) {
			dd=String.format("%.0f", d);
		}else { dd=String.format("%.1f", d);
		}
		if(isDoubleInteger(uu)) {
			 u=String.format("%.0f", uu);
		}
		else {
			u=String.format("%.1f", uu);
		}
		
		return "" + ma + " " + ten + " " + u + " " + dd + " " + dau + "";
	}
	 public static boolean isDoubleInteger(double number) {
	        // Ép kiểu double thành int để kiểm tra xem giá trị của nó thay đổi hay không
	        int intValue = (int) number;
	        
	        // So sánh giá trị ban đầu với giá trị sau khi ép kiểu
	        return number == intValue;
	    }
	@Override
	public int compareTo(hi o) {
		// TODO Auto-generated method stub
		return Double.compare(o.d, this.d);
	}
	
/*
2
KV2A002
Hoang Thanh Tuan
5
6
5
KV2B123
Ly Thi Thu Ha
8
6,5
7	
 */
}
