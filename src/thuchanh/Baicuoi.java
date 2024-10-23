package thuchanh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Baicuoi {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<gc> ds=new ArrayList<gc>();
	int n=sc.nextInt();
	sc.nextLine();
	while(n-->0) {
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String nhom=sc.nextLine();
		String gv=sc.nextLine();
		ds.add(new gc(ma,ten,nhom,gv));
	}
	Collections.sort(ds);
	n=sc.nextInt();
	sc.nextLine();
	
	while(n-->0) {
		boolean chek=true;
		String ma=sc.next();
		for (gc gc : ds) {
			if(gc.getMa().equals(ma)&&chek) {
				System.out.printf("Danh sach nhom lop mon %s:\n",gc.getTen());
				chek=false;
			}
			if(gc.getMa().equals(ma))System.out.println(gc);
		}
	}
}
}
class gc implements Comparable<gc>{
	private String ma,ten,gv,nhom;
	
	public gc(String ma, String ten, String nhom, String gv) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gv = gv;
		this.nhom = nhom;
	}
    
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return nhom+" "+gv;
	}

	@Override
	public int compareTo(gc o) {
		// TODO Auto-generated method stub
		return this.nhom.compareTo(o.nhom);
	}

}
/*
4
THCS2D20
Tin hoc co so 2 - D20
01
Nguyen Binh An
CPPD20
Ngon ngu lap trinh C++ - D20
01
Le Van Cong
THCS2D20
Tin hoc co so 2 - D20
02
Nguyen Trung Binh
LTHDTD19
Lap trinh huong doi tuong - D19
01
Nguyen Binh An
1
THCS2D20
*/