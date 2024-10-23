package thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class bai2_uutien {
	public static long chuyengiay(String s) {
		int gio=Integer.parseInt(s.substring(0,2));
		int phut=Integer.parseInt(s.substring(3,5));
		return Integer.parseInt(s.substring(6,8))+gio*3600+phut*60;
	}
	public static String chuoi(long giay) {
		long gio=giay/3600;
		giay%=3600;
		long phut= giay/60;
		return du(gio)+":"+du(phut)+":"+du(giay%60);
	}
	public static String du(long a) {
		if(a<10) return "0"+a;
		else return ""+a;
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	ArrayList<vv> ds=new ArrayList<vv>();
	sc.nextLine();
	int dem=0;
	while(n-->0) {
		dem++;
		String ten=sc.nextLine();
		String ns=sc.nextLine();
		String xuatphat=sc.nextLine();
		String ve=sc.nextLine();
		long uutien=0;
		int tuoi=2021-Integer.parseInt(ns.substring(6, 10));
		if(tuoi<18) uutien=0;
		else if(tuoi<25) uutien=1;
		else if(tuoi<33) uutien=2;
		else uutien=3;
		long hehe= chuyengiay(ve)-chuyengiay(xuatphat)-uutien;
		ds.add(new vv(du(dem), ten,chuoi(hehe+uutien),chuoi(uutien),chuoi(hehe),(int)hehe));
	}
	Collections.sort(ds);
    ds.get(0).setXephang(1);
    for(int i=1;i<ds.size();i++) {
    	if(ds.get(i).getTong()==ds.get(i-1).getTong()) {
    		ds.get(i).setXephang(ds.get(i-1).getXephang());
    	}else {
    		ds.get(i).setXephang(i+1);
    	}
    }
    Collections.sort(ds, new Comparator<vv>() {

		@Override
		public int compare(vv o1, vv o2) {
			// TODO Auto-generated method stub
			return o1.getMa().compareTo(o2.getMa());
		}
	});
    for (vv vv : ds) {
		System.out.println(vv);
	}

}
}
class vv implements Comparable<vv>{
	private String ma,ten,thucte,uutien,thanhtich;
	private int xephang;
	private int tong;
	public vv(String ma, String ten, String thucte, String uutien, String thanhtich, int tong) {
		
		this.ma = "VDV"+ma;
		this.ten = ten;
		this.thucte = thucte;
		this.uutien = uutien;
		this.thanhtich = thanhtich;
		this.xephang = 0;
		this.tong = tong;
	}
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public int getXephang() {
		return xephang;
	}

	public void setXephang(int xephang) {
		this.xephang = xephang;
	}

	public int getTong() {
		return tong;
	}

	public void setTong(int tong) {
		this.tong = tong;
	}

	@Override
	public int compareTo(vv o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.tong, o.tong);
	}

	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + thucte + " " + uutien + " "
				+ thanhtich + " " + xephang ;
	}
	
	
	
}
/*
3
Nguyen Van Thanh
20/03/1990
07:00:00
07:10:01
Nguyen Hoa Binh
01/10/1993
07:02:00
07:11:20
Le Thanh Van
15/03/1998
07:05:00
07:15:30
*/