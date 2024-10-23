package J05_array_object;

import java.util.ArrayList;
import java.util.Scanner;

public class J05074 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<hehee> ds=new ArrayList<>();
		int n=sc.nextInt();
		int m=n;
		sc.nextLine();
		while(n-->0) {
			
			String ma=sc.nextLine();
			String ten=sc.nextLine();
			String lop=sc.nextLine();
			ds.add(new hehee(ma, ten, lop));
		}
		while(m-->0) {
			String ma=sc.next();
			String dd=sc.next();
			for (hehee hehee : ds) {
				if(hehee.getMa().equals(ma)) {
					int d=10;
					for(int i=0;i<dd.length();i++) {
						if(dd.charAt(i)=='m') d--;
						else if(dd.charAt(i)=='v') d-=2;
					}
					if(d<0) d=0;
					hehee.setD(d);
				}
			}
		}
		
		String lop=sc.next();
		for (hehee dao : ds) {
			if(dao.getL().equals(lop)) System.out.println(dao);
		}
	}
}
class hehee{
	private String ma,ten,lop;
	private int d;
	public hehee(String ma, String ten, String lop) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.lop = lop;
	}
	public String getMa() {
		return ma;
	}
	public String getL() {
		return lop;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	@Override
	public String toString() {
		if(d==0) {
			return "" + ma + " " + ten + " " + lop + " " + d + " KDDK";
		}else	return "" + ma + " " + ten + " " + lop + " " + d + "";
	}
	
}
/*
3
B19DCCN999
Le Cong Minh
D19CQAT02-B
B19DCCN998
Tran Truong Giang
D19CQAT02-B
B19DCCN997
Nguyen Tuan Anh
D19CQCN04-B
B19DCCN998 xxxmxmmvmx
B19DCCN997 xmxmxxxvxx
B19DCCN999 xvxmxmmvvm
*/