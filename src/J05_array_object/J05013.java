package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05013 {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<hocssih> ds=new ArrayList<>();
		int n=sc.nextInt();
		int dem=0;
		while(n-->0) {
			dem++;
			sc.nextLine();
			String ten=sc.nextLine();
			double d1=sc.nextDouble();
			double d2=sc.nextDouble();
			hocssih e=new hocssih(dem,ten, d1, d2);
			ds.add(e);

		}
		Collections.sort(ds);
		for (hocssih hocssih : ds) {
			System.out.println(hocssih);
		}
	}
}
class hocssih implements Comparable<hocssih>{
	private String ma,ten,hehe;
	private double d1,d2,dtb;
	public hocssih(int ma,String ten, double d1, double d2) {
		super();
		if(ma<10) {
			this.ma="TS0"+ma;
		}else {
			this.ma="TS"+ma;
		}
		this.ten = ten;
		if(d1>10) {
			this.d1=d1/10;
		}else this.d1=d1;
		
		if(d2>10) this.d2=d2/10;
		else this.d2=d2;
		
		this.dtb=(this.d1+this.d2)/2;
		
		if(dtb<5) this.hehe="TRUOT";
		else if(dtb<8) this.hehe="CAN NHAC";
		else if(dtb<=9.5) this.hehe="DAT";
		else this.hehe="XUAT SAC";
	}
	@Override
	public String toString() {
		String dt=String.format("%.2f", dtb);
		return  ma+" "+ten + " " + dt+" "+hehe;
	}
	@Override
	public int compareTo(hocssih o) {
		// TODO Auto-generated method stub
		return Double.compare(o.dtb, this.dtb);
	}
	
	
}
