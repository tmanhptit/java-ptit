package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05028 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ArrayList<doanh> ds=new ArrayList<>();
	int n=sc.nextInt();
	while(n-->0) {
		sc.nextLine();
		String ma=sc.nextLine();
		String ten=sc.nextLine();
		int sl=sc.nextInt();
		doanh e=new doanh(ma, ten, sl);
		ds.add(e);
	}
	Collections.sort(ds);
	for (doanh doanh : ds) {
		System.out.println(doanh);
	}
}
}
class doanh implements Comparable<doanh>{
	private String ma,ten;
	private int soluong;
	public doanh(String ma, String ten, int soluong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.soluong = soluong;
	}
	@Override
	public String toString() {
		return "" + ma + " " + ten + " " + soluong;
	}
	@Override
	public int compareTo(doanh o) {
		// TODO Auto-generated method stub
		if(o.soluong!=this.soluong) {
		return Integer.compare(o.soluong, this.soluong);
		}else {
			return this.ma.compareTo(o.ma);
		}
	}
	
}
