package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05030 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<bang> ds=new ArrayList<>();
	while(n-->0) {
		sc.nextLine();
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String lop=sc.nextLine();
		double d1=sc.nextDouble();
		double d2=sc.nextDouble();
		double d3=sc.nextDouble();
		
		bang b1=new bang(ma, ten, lop, d1, d2, d3);
		ds.add(b1);
	}
	Collections.sort(ds);
	int dem=0;
	for (bang bang : ds) {
		dem++;
		System.out.println(dem+" "+bang);
		
	}
}
}
class bang implements Comparable<bang>{
	private String ma,ten,lop;
	private double d1,d2,d3;
	public bang(String ma, String ten, String lop, double d1, double d2, double d3) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
	}
	@Override
	public String toString() {
		String dd1=String.format("%.1f", d1);
		String dd2=String.format("%.1f", d2);
		String dd3=String.format("%.1f", d3);

		return   ma + " " + ten + " " + lop + " " + dd1 + " " + dd2 + " " + dd3 ;
	}
	@Override
	public int compareTo(bang o) {
		// TODO Auto-generated method stub
		return this.ten.compareTo(o.ten);
	}
	
}
