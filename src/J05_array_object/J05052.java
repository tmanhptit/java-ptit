package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05052 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<dooo> ds = new ArrayList<>();

		while (n-- > 0) {
			sc.nextLine();
			String ten = sc.nextLine();
			String ma = sc.nextLine();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			ds.add(new dooo(ten, ma, a, b));
		}
		 Collections.sort(ds);
		for (dooo dooo : ds) {
			System.out.println(dooo);
		}
	}
}

class dooo implements Comparable<dooo>{
	private String ten, ma;
	private String stt;
	private int sttt;
	
	private double giamgia, thanhtien;

	public dooo(String ten, String ma, double giamgia, double thanhtien) {
		super();
		this.ten = ten;
		this.ma = ma;
		this.stt = ma.substring(1,4);
		this.sttt=Integer.parseInt(this.stt);
		if (ma.charAt(4) == '2')
			this.giamgia = giamgia * thanhtien * 3 / 10;
		   
		else
			this.giamgia = giamgia * thanhtien / 2;

		this.thanhtien = giamgia * thanhtien - this.giamgia;
	}

	@Override
	public String toString() {
		long thanht = Math.round(thanhtien);
		long phu = Math.round(giamgia);

		return ten + " " + ma + " " + stt + " " + phu + " " + thanht;

	}

	@Override
	public int compareTo(dooo o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.sttt,o.sttt);
	}

}
/*
3
Kaki 2
K0252
80000
15
Jean 1
J2011
200000
24
Jean 2
J0982
150000
12
*/
