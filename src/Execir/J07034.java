package Execir;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07034 {
public static void main(String[] args)throws IOException {
	String path="E:\\Code\\Eclip\\eclipse-workspace\\CODETIT\\src\\Execir\\manh.txt";
	Scanner sc=new Scanner(new File(path));
	ArrayList<mon> ds=new ArrayList<mon>();
	int n=Integer.parseInt(sc.nextLine().trim());
	while(n-->0) {
		ds.add(new mon(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine().trim())));
	}
	Collections.sort(ds);
	for (mon mon : ds) {
		System.out.println(mon);
	}
}
}

class mon implements Comparable<mon>{
	private String ma,ten;
	private int so;
	public mon(String ma, String ten, int so) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.so = so;
	}
	@Override
	public String toString() {
		return String.format("%s %s %d", ma,ten,so);
	}
	@Override
	public int compareTo(mon o) {
		// TODO Auto-generated method stub
		return this.ten.compareTo(o.ten);
	}
	
}