package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05048 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<hhe> ds=new ArrayList<hhe>();
	int n=sc.nextInt();
	while(n-->0) {
		//sc.nextLine();
		ds.add(new hhe(sc.next(),sc.nextDouble()));
	}
	Collections.sort(ds);
	char cha=sc.next().charAt(0);
	for (hhe hhe : ds) {
		if(cha==hhe.getMa()) System.out.println(hhe);
	}
}
}
class hhe implements Comparable<hhe>{
	private String ma;
	private double nhap,xuat,dongia,tien,thue;
	public hhe(String ma, double soluong) {
		int n=ma.length();
		this.ma = ma;
		if(this.ma.charAt(0)=='A') this.xuat=Math.round(soluong*0.6);
		else this.xuat=Math.round(soluong*0.7);
		
		this.nhap = soluong;
		
		if(ma.charAt(n-1)=='Y') this.dongia=110000;
		else this.dongia=135000;
		
		this.tien=xuat*dongia;
		
		if(ma.charAt(0)=='A') {
			if(ma.charAt(n-1)=='Y') this.thue=tien*0.08;
			else this.thue=tien*0.11;
			
		}else {
			if(ma.charAt(n-1)=='Y') this.thue=tien*0.17;
			else this.thue=tien*0.22;
		}
		
		
	}
	
	public char getMa() {
		return ma.charAt(0);
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	@Override
	public String toString() {
		String he=String.format("%.0f %.0f %.0f %.0f %.0f",nhap,xuat,dongia,tien,thue);
		return "" + ma + " "+he;
	}
/*	
3
A001Y
1000
B012N
2500
B003Y
4582
*/

	@Override
	public int compareTo(hhe o) {
		// TODO Auto-generated method stub
		return Double.compare(o.thue, this.thue);
	}
}
