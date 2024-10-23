package thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai1_xephanghs {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<hs> ds=new ArrayList<hs>();
	int n=sc.nextInt();
	int dem=0;
	while(n-->0) {
		dem++;
		sc.nextLine();
		ds.add(new hs(dem,sc.nextLine(),sc.nextDouble()));
	}
	Collections.sort(ds);
    Map<Double, Integer> map=new HashMap<Double, Integer>();
	
    ds.get(0).setXephang(1);
    for(int i=1;i<ds.size();i++) {
    	if(ds.get(i).getD()==ds.get(i-1).getD()) {
    		ds.get(i).setXephang(ds.get(i-1).getXephang());
    	}else {
    		ds.get(i).setXephang(i+1);
    	}
    }
    Collections.sort(ds, new Comparator<hs>() {

		@Override
		public int compare(hs o1, hs o2) {
			// TODO Auto-generated method stub
			return o1.getMa().compareTo(o2.getMa());
		}
	});
    for (hs hs : ds) {
		System.out.println(hs);
	}
	
}
}
class hs implements Comparable<hs>{
	private String ma,ten,hang;
	private double d;
	private int xephang;
	public hs(int ma, String ten, double d) {
		if(ma<10)this.ma="HS0"+ma;
		else this.ma ="HS"+ ma;
		
		this.ten = ten;
		this.d = d;
		
		if(d<5) this.hang="Yeu";
		else if(d<7) this.hang="Trung Binh";
		else if(d<9) this.hang="Kha";
		else this.hang="Gioi";
		this.xephang=0;
	}
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public int getXephang() {
		return xephang;
	}
	public void setXephang(int xephang) {
		this.xephang = xephang;
	}
	@Override
	public String toString() {
		String hehe= String.format("%.1f", d);
		return "" + ma + " " + ten + " " + d + " " + hang + " " + xephang + "";
	}
	@Override
	public int compareTo(hs o) {
		// TODO Auto-generated method stub
		return Double.compare(o.d, this.d);
	}
	
	
}
/*
3
Tran Minh Hieu
5,9
Nguyen Bao Trung
8,6
Le Hong Ha
9,2
*/