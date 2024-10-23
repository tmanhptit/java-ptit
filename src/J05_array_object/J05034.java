package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05034 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	ArrayList<haha> ds=new ArrayList<>();
	int dem=0;
	sc.nextLine();
	while(n-->0) {
		dem++;
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		String lop=sc.nextLine();
		String em =sc.nextLine();
		String dn=sc.nextLine();
		haha ha=new haha(ma, ten, lop, em, dn, dem);
		ds.add(ha);
	}
	Collections.sort(ds);
	int q=sc.nextInt();
	sc.nextLine();
	while(q-->0) {
		String dn=sc.nextLine().trim();
		for (haha haha : ds) {
			if(haha.getDn().equals(dn))System.out.println(haha);
		}
	}
}
}
class haha implements Comparable<haha>{
	private String ma,ten,lop,email,dn;
	private int stt;
	
	
	public haha(String ma, String ten, String lop, String email, String dn, int stt) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
		this.email = email;
		this.dn = dn;
		this.stt = stt;
	}


	public String getDn() {
		return dn;
	}


	public void setDn(String dn) {
		this.dn = dn;
	}


	@Override
	public String toString() {
		return stt+" " + ma + " " + ten + " " + lop + " " + email + " " + dn ;
	}


	public int compareTo(haha o) {
		// TODO Auto-generated method stub
		return this.ten.compareTo(o.ten);
	}
	
}
