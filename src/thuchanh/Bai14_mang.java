package thuchanh;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Bai14_mang {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<hehee> ds=new ArrayList<hehee>();
	int[][] hh=new int[4][4];
	hh[0]=new int[]{ 10,12,14,20 };
	hh[1]=new int[]{ 10,11,13,16 };
	hh[2]=new int[]{ 9,10,12,14 };
	hh[3]=new int[]{ 8,9,11,13 };
	
	HashMap<String, String>map= new HashMap<String, String>();
	int n=sc.nextInt();
	sc.nextLine();
	while(n-->0) {
		map.put(sc.next(), sc.nextLine());
	}
	
	n=sc.nextInt();
	while(n-->0) {
		sc.nextLine();
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String phong=map.get(ma.substring(3, 5));
		double coban=sc.nextDouble();
		double ngaycong=sc.nextDouble();
		int i=0;
		int j=0;
		if(ma.charAt(0)=='A')i=0;
		else if(ma.charAt(0)=='B') i=1;
		else if(ma.charAt(0)=='C') i=2;
		else i=3;
	    
		int nam=Integer.parseInt(ma.substring(1, 3));
		if(nam<4) j=0;
		else if(nam<9) j=1;
		else if(nam<16) j=2;
		else j=3;
		double luong=coban*ngaycong*hh[i][j];
		//System.out.printf("i va j: %d %d %d\n",i,j,hh[i][j]);
		//System.out.printf("%s %s %s %d %.0f\n",ma,ten,phong,hh[i][j],luong*1000);
		ds.add(new hehee(ma, ten, luong));
	}
	sc.nextLine();
	String ma=sc.next();
	System.out.printf("Bang luong phong%s:\n",map.get(ma));
	for (hehee is : ds) {
		if(is.getMa().equals(ma)) System.out.println(is);
	}
}
}

class hehee {
	private String ma, ten;
	private double luong;
	public hehee(String ma, String ten, double luong) {
		super();
		this.ma = ma;
		this.ten = ten;
		
		this.luong = luong;
	}
	@Override
	
	public String toString() {
		String p=String.format(" %.0f",luong*1000);
		return "" + ma + " " + ten + p;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getMa() {
		return ma.substring(3, 5);
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
    
}
/*
2
HC Hanh chinh
KH Ke hoach Dau tu
2
C06HC
Tran Binh Minh
65
25
D03KH
Le Hoa Binh
59
24
*/