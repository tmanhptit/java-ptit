package thuchanh;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai3_DSHSDAU {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<hss> ds = new ArrayList<hss>();
		int n = sc.nextInt();
		int dem = 0;
		while (n-- > 0) {
			dem++;
			sc.nextLine();
			
		 hss e=new hss(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
			ds.add(e);
		}
		Collections.sort(ds);
		for (hss hss : ds) {
			System.out.println(hss);
		}
	}
}

class hss implements Comparable<hss> {
	private String ma, ten, xephang;
	private double ut, d;

	public hss(String ma, String ten, double d,double d2,double d3) {
		super();
		this.ma = ma;
		this.ten = ten;
		
		if(ma.charAt(2)=='1') this.ut=0.5;
		else if(ma.charAt(2)=='2')this.ut = 1;
		else this.ut=2.5;
		
		this.d = d*2+d2+d3+this.ut;
		if(this.d<24) this.xephang="TRUOT";
		else this.xephang="TRUNG TUYEN";
	}

	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + hehe(ut) + " " + hehe(d) + " " + xephang;
	}

	@Override
	public int compareTo(hss o) {
		// TODO Auto-generated method stub
		return Double.compare(o.d,this.d);
	}
    public static String hehe(double u) {
    	if(u*10%10>0) {
    		return String.format("%.1f", u);
    	}else {
    		int a=(int)(u*10/10);
    		return ""+a;
    	}
    }
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