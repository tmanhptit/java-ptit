package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;


public class J05046 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int dem=0;
	ArrayList<kho> ds=new ArrayList<>();
	HashMap<String, Integer> map=new HashMap<String, Integer>();
	while(n-->0) {
		dem++;
		sc.nextLine();
		String ten=sc.nextLine();
		long soluong=sc.nextLong();
		long dong=sc.nextLong();
		
		Scanner s=new Scanner(ten);
		String ma="";
		for(int i=1;i<3;i++) {
			ma+=s.next().substring(0,1).toUpperCase();
		}
		if(map.containsKey(ma)) {
			map.put(ma, map.get(ma)+1);
			ma=ma+"0"+(map.get(ma));
			
		}else {
			map.put(ma, 1);
			ma=ma+"01";
		}
		
		ds.add(new kho(ma,ten,soluong,dong));
	}
	Collections.sort(ds);
	for (kho kho : ds) {
		System.out.println(kho);
	}
	
}
}
class kho implements Comparable<kho>{
	private String ma,ten;
	private double tienchietkhau,thanhtien;
	public kho(String ma, String ten, long soluong, long dongia) {
		this.ten=ten;

		this.ma=ma;
		double hehe=(double)(dongia*soluong);
		
		if(soluong>10) {
			this.tienchietkhau=hehe*0.05;
			this.thanhtien=hehe*0.95;
		}
		else if(soluong>7) {
			this.tienchietkhau=hehe*0.02;
			this.thanhtien=hehe*0.98;
		}
		else if(soluong>4) {
			this.tienchietkhau=hehe*0.01;
			this.thanhtien=hehe*0.99;
		}
		else {
			this.tienchietkhau=hehe*0;
			this.thanhtien=hehe;
		}
		
		
	}
	@Override
	public String toString() {
		String hehe=String.format("%.0f %.0f", tienchietkhau,thanhtien);
		return "" + ma + " " + ten + " "+hehe;
	}
	@Override
	public int compareTo(kho o) {
		// TODO Auto-generated method stub
		return Double.compare(o.tienchietkhau, this.tienchietkhau);
	}
	
/*
3
May lanh SANYO
10
4000000
Dien thoai Samsung
10
3230000
Dien thoai Nokia
8
1240000
*/	
 
	
}
