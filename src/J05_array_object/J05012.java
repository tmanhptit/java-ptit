package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05012 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<may> ds=new ArrayList<>();
	while(n-->0) {
		sc.nextLine();
		//System.out.prdoubleln("ma");
		String ma=sc.nextLine();
		////System.out.prdoubleln("ten");
		String ten=sc.nextLine();
		double soluong=sc.nextDouble();
		double chiet=sc.nextDouble();
		double tien=sc.nextDouble();
		
		may e=new may(ma, ten, soluong, chiet, tien);
		ds.add(e);		
	}
	Collections.sort(ds);
	for (may may : ds) {
		System.out.println(may);
	}
	
}
}
class may implements Comparable<may>{
	private String ma,ten;
	private double soluong,chietkhau,tien;
	private double tong;
	public may(String ma, String ten, double soluong, double chietkhau, double tien) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soluong = soluong;
		this.chietkhau = chietkhau;
		this.tien = tien;
		this.tong=soluong*chietkhau-tien;
	}
	@Override
	public String toString() {
		String sol = String.format("%.0f", soluong);
		String chietk = String.format("%.0f", chietkhau);
		String tienn = String.format("%.0f", tien);
		String tongg = String.format("%.0f", tong);
		return  ma + " " + ten + " " + sol + " " + chietk + " " + tienn
			+" "+tongg	;
	}
	@Override
	public int compareTo(may o) {
		// TODO Auto-generated method stub
		return Double.compare(o.tong, this.tong);
	}
	
}
