package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05022 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<sinhvin> dicumay=new ArrayList<sinhvin>();
	int n=sc.nextInt();
	sc.nextLine();
	while(n-->0) {
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String lop=sc.nextLine();
		String email=sc.nextLine();
		sinhvin e=new sinhvin(ma, ten, lop, email);
		dicumay.add(e);
	}
	
	Collections.sort(dicumay);
	int q=sc.nextInt();
	sc.nextLine();
	while(q-->0) {
		String lop=sc.nextLine().trim();
		System.out.println("DANH SACH SINH VIEN LOP "+lop+":");
		for (sinhvin sinhvin : dicumay) {
			if(lop.equals(sinhvin.getLop())) {
				System.out.println(sinhvin);
			}
		}
	}
	
}
}
class sinhvin implements Comparable<sinhvin>{
	private String ma,ten,lop,email,lopp;

	public sinhvin(String ma, String ten, String lop, String email) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
		this.lopp=lop+ma;
	}

	public String getLopp() {
		return lopp;
	}

	public void setLopp(String lopp) {
		this.lopp = lopp;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getLop() {
		return lop;
	}

	public void setLop(String lop) {
		this.lop = lop;
	}

	@Override
	public String toString() {
		//return lopp;
		return ma + " " + ten + " " + lop + " " + email ;
	}

	

	@Override
	public int compareTo(sinhvin o) {
		// TODO Auto-generated method stub
		return this.lop.compareTo(o.getLop());
	}
	
}
