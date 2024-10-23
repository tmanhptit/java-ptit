package J05_array_object;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J05032 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.nextLine();
	ArrayList<tre> ds=new ArrayList<>();
	while(n-->0) {
		String ten=sc.next();
		String ns=sc.next();
		tre e=new tre(ten, ns);
		ds.add(e);
	}
	Collections.sort(ds);
	System.out.println(ds.get(0));
	System.out.println(ds.get(ds.size()-1));
}
}
class tre implements Comparable<tre>{
	private String ten,ns;
	private int d,m,y,t;
	public tre(String ten, String ns) {
		super();
		this.ten = ten;
		this.ns = ns;
		this.d=Integer.parseInt(ns.substring(0, 2));
		this.m=Integer.parseInt(ns.substring(3, 5));
		this.y=Integer.parseInt(ns.substring(6, 10));
		this.t=y*360+m*30+d;
	}
	@Override
	public String toString() {
		return  ten ;
	}
	@Override
	public int compareTo(tre o) {
		// TODO Auto-generated method stub
		return Integer.compare(o.t, this.t);
	}
	
}