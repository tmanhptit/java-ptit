package thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Cucxilau {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<xang> ds=new ArrayList<xang>();
	
	while(n-->0) {
		sc.nextLine();
		String ma=sc.next();
		double soluong=sc.nextDouble();
		ds.add(new xang(ma,soluong));
	}
	//Collections.sort(ds);
	for (xang xang : ds) {
		System.out.println(xang);
	}
}
}
class xang implements Comparable<xang>{
	private String ma,ten;
	private double dongia,thue,thanhtien;
	public xang(String ma, double soluong) {
		this.ma=ma;
		
		if(ma.substring(3,5).equals("BP")) this.ten="British Petro";
		else if(ma.substring(3,5).equals("ES")) this.ten="Esso";
		else if(ma.substring(3,5).equals("SH")) this.ten="Shell";
		else if(ma.substring(3,5).equals("CA")) this.ten="Castrol";
		else if(ma.substring(3,5).equals("MO")) this.ten="Mobil";
		else this.ten="Trong Nuoc";
		
		if(ma.charAt(0)=='X') {
			this.dongia=128000;
			
			if(this.ten.equals("Trong Nuoc")) this.thue=0;
			else this.thue= soluong*this.dongia*0.03;
			
		}else if(ma.charAt(0)=='D') {
			this.dongia=11200;
			
			if(this.ten.equals("Trong Nuoc")) this.thue=0;
			else this.thue= soluong*this.dongia*0.035;
			
		}else {
			this.dongia=9700;
		
			if(this.ten.equals("Trong Nuoc")) this.thue=0;
			else this.thue=soluong*this.dongia*0.02;
		}
		this.thanhtien=soluong*this.dongia+this.thue;
		
	}
	@Override
	public String toString() {
		String he=String.format("%.0f %.0f %.0f" , dongia,thue,thanhtien);
		return "" + ma + " " + ten + " " +he;
	}
	@Override
	public int compareTo(xang o) {
		// TODO Auto-generated method stub
		return Double.compare(o.thanhtien, this.thanhtien);
	}
	
	
}
/*
 * 
3
N89BP 4500
D00BP 3500
X92SH 2600
*/
