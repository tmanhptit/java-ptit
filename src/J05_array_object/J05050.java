package J05_array_object;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05050 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<doo> ds=new ArrayList<doo>();
	int dem=0;
	while(n-->0) {
		dem++;
		sc.nextLine();
		String ten=sc.next().toUpperCase();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		ds.add(new doo(dem,ten,b-a));
	}
	Collections.sort(ds);
	for (doo doo : ds) {
		System.out.println(doo);
	}
}
}
class doo implements Comparable<doo>{
	private String ma;
	private int heso;
	private double thanhtien,phutroi,tong;
	public doo(int dem,String heso, double thanhtien) {
		super();
		if(dem<10) this.ma="KH0"+dem;
		else this.ma="KH"+dem;
		if(heso.equals("KD")) this.heso=3;
		else if(heso.equals("NN")) this.heso=5;
		else if(heso.equals("TT")) this.heso=4;
		else this.heso=2;
		
		this.thanhtien = thanhtien*this.heso*550;
		
		if(thanhtien<50) this.phutroi=0;
		else if(thanhtien<=100) this.phutroi=this.thanhtien*35/100;
		else this.phutroi=this.thanhtien;
		
		this.tong=this.thanhtien+this.phutroi;
	}
	@Override
	public String toString() {
		long thanht=Math.round(thanhtien);
		long phu=Math.round(phutroi);
		long tongg=Math.round(tong);
		return ma+" "+heso+" "+thanht+" "+phu+" "+tongg;
	}
	@Override
	public int compareTo(doo o) {
		// TODO Auto-generated method stub
		return Double.compare(o.tong, this.tong);
	}
	
/*
3
KD
400
555
NN
58
400
CN
150
700
 */
}
