package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05029 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<nghiep> ds=new ArrayList<>();
	int n=sc.nextInt();
	while(n-->0) {
		sc.nextLine();
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		int sl=sc.nextInt();
		nghiep e=new nghiep(ma, ten, sl);
		ds.add(e);
	}
	Collections.sort(ds);
	int q=sc.nextInt();
	while(q-->0) {
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.printf("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:",a,b);
		System.out.println();
		
		for (nghiep nghiep : ds) {
			if(nghiep.getSoluong()>=a&&nghiep.getSoluong()<=b)System.out.println(nghiep);
		}
	}
}
}
class nghiep implements Comparable<nghiep>{
	private String ma,ten;
	private int soluong;
	public nghiep(String ma, String ten, int soluong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soluong = soluong;
	}
	
	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + soluong;
	}
	@Override
	public int compareTo(nghiep o) {
		// TODO Auto-generated method stub
		if(o.soluong!=this.soluong) {
		return Integer.compare(o.soluong, this.soluong);
		}else {
			return this.ma.compareTo(o.ma);
		}
	}
	
}
