package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class J05023 {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	ArrayList<sucvat> dicumay=new ArrayList<sucvat>();
	int n=sc.nextInt();
	sc.nextLine();
	while(n-->0) {
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String lop=sc.nextLine();
		String email=sc.nextLine();
		sucvat e=new sucvat(ma, ten, lop, email);
		dicumay.add(e);
	}
	
	Collections.sort(dicumay);
	int q=sc.nextInt();
	//sc.nextLine();
	while(q-->0) {
		int lop=sc.nextInt();
		System.out.println("DANH SACH SINH VIEN KHOA "+lop+":");
		for (sucvat sucvat : dicumay) {
			if(sucvat.getLopp()==lop%100) System.out.println(sucvat);
		}
	}
	
}
}
class sucvat implements Comparable<sucvat>{
	private String ma,ten,lop,email;
	private int lopp;

	public sucvat(String ma, String ten, String lop, String email) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
		this.lopp=Integer.parseInt(lop.substring(1,3));
	}

	public int getLopp() {
		return lopp;
	}

	public void setLopp(int lopp) {
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
	public int compareTo(sucvat o) {
		// TODO Auto-generated method stub
		return this.lop.compareTo(o.getLop());
	}
	
}
